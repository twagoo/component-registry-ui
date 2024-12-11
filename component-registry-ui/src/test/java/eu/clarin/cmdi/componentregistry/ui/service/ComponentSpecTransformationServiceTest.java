/*
 * Copyright (C) 2024 CLARIN ERIC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.clarin.cmdi.componentregistry.ui.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.jayway.jsonpath.PathNotFoundException;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ElementType;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.LIST;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author twagoo
 */
@SpringBootTest
public class ComponentSpecTransformationServiceTest {

    private ComponentSpec spec;
    private ComponentSpecTransformationService instance;

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private com.jayway.jsonpath.Configuration jsonPathConfiguration;

    @BeforeEach
    public void setUp() {
        instance = new ComponentSpecTransformationService(objectMapper, jsonPathConfiguration);

        spec = new ComponentSpec();
        spec.setComponent(new ComponentType());
        spec.getComponent().setName("root");

        spec.getComponent().setComponent(Lists.newArrayList(
                new ComponentType(), new ComponentType(), new ComponentType()
        ));
        spec.getComponent().getComponent().get(0).setName("one");
        spec.getComponent().getComponent().get(1).setName("two");
        spec.getComponent().getComponent().get(2).setName("three");

        spec.getComponent().getComponent().get(1).setElement(Lists.newArrayList(
                new ElementType(), new ElementType(), new ElementType()));

        spec.getComponent().getComponent().get(1).getElement().get(0).setName("one");
        spec.getComponent().getComponent().get(1).getElement().get(1).setName("two");
        spec.getComponent().getComponent().get(1).getElement().get(2).setName("three");
    }

    /**
     * Test of deletePath method, of class ComponentSpecTransformationService.
     */
    @Test
    public void testDeletePathNoChange() throws Exception {
        // request deletion with no path set
        ComponentSpec result = instance.deletePath(spec, null);

        //content assertions
        assertThat(result).isInstanceOf(ComponentSpec.class).hasFieldOrProperty("component");
        assertThat(result)
                .extracting("component.component")
                .isInstanceOf(List.class);

        //components directly below root component
        assertThat(result.getComponent().getComponent())
                .hasSize(3)
                .extracting("name")
                .containsAll(ImmutableList.of("one", "two", "three"));

        //elements of component[1]
        assertThat(result)
                .extracting("component.component")
                .asInstanceOf(LIST)
                .element(1)
                .extracting("element")
                .isInstanceOf(List.class);

        assertThat(result.getComponent().getComponent().get(1).getElement())
                .hasSize(3)
                .extracting("name")
                .containsAll(ImmutableList.of("one", "two", "three"));
    }

    /**
     * Test of deletePath method, of class ComponentSpecTransformationService.
     */
    @Test
    public void testDeletePath() throws Exception {
        ComponentSpec intermediate = instance.deletePath(spec, "component.component[1].element[1]");
        ComponentSpec result = instance.deletePath(intermediate, "component.component[0]");

        //components directly below root component
        assertThat(result.getComponent().getComponent())
                .hasSize(2)
                .extracting("name")
                .as("Components 'two' and 'three' should remain after removal of 'one'")
                .containsAll(ImmutableList.of("two", "three"));

        //elements of component "two"
        assertThat(result)
                .extracting("component.component")
                .asInstanceOf(LIST).element(0) // because of deletion of "one", "two" is now at [0]
                .extracting("element").asInstanceOf(LIST)
                .hasSize(2)
                .extracting("name")
                .as("Elements 'one' and 'three' should remain after removal of 'two'")
                .containsAll(ImmutableList.of("one", "three"));
    }

    @Test
    public void testAddChildComponent() throws Exception {
        //adding a new empty child component to an existing component
        final ComponentSpec result1 = instance.addChildComponent(spec, "component.component[0]");

        assertThat(result1).isNotNull();
        assertThat(result1)
                .extracting("component.component").asInstanceOf(LIST)
                .element(0)
                //there should be a new child component
                .extracting("component").asInstanceOf(LIST)
                .as("A new component should have been added as a child")
                .hasExactlyElementsOfTypes(ComponentType.class);

        result1.getComponent().getComponent().get(0).getComponent().get(0).setName("first");

        //add another component
        final ComponentSpec result2 = instance.addChildComponent(result1, "component.component[0]");
        assertThat(result2)
                .extracting("component.component").asInstanceOf(LIST)
                .element(0)
                //there should be a new child component
                .extracting("component").asInstanceOf(LIST)
                .satisfiesExactly(
                        child1 -> {
                            assertThat(child1)
                                    .as("Existing component with name")
                                    .hasFieldOrPropertyWithValue("name", "first");
                        },
                        child2 -> {
                            assertThat(child2)
                                    .extracting("name")
                                    .as("New component without name")
                                    .isNull();
                        }
                );
    }

    /**
     * Operations that should fail
     */
    @Test
    public void testAddChildComponentIllegally() {
        //Add to element
        {
            ComponentSpecTransformationException exception = assertThrows(
                    ComponentSpecTransformationException.class,
                    () -> {
                        instance.addChildComponent(spec, "component.component[1].element[0]");
                    },
                    "Trying to add a component to an element should throw");
            assertThat(exception)
                    .as("message should explain issue")
                    .hasMessageContaining("Could not add item");
        }
        //Add to non-existent
        {
            ComponentSpecTransformationException exception = assertThrows(
                    ComponentSpecTransformationException.class,
                    () -> {
                        instance.addChildComponent(spec, "component.component[5]");
                    },
                    "Trying to add a component to a path that does not exist should throw");
            assertThat(exception)
                    .as("message should explain issue")
                    .hasMessageContaining("Could not add item");
        }
    }

    @Test
    public void testAddChildElement() throws Exception {
        {
            //adding a new empty child component to an existing component
            final ComponentSpec result1 = instance.addChildElement(spec, "component.component[0]");

            assertThat(result1).isNotNull();
            assertThat(result1)
                    .extracting("component.component").asInstanceOf(LIST)
                    .element(0)
                    //there should be a new child component
                    .extracting("element").asInstanceOf(LIST)
                    .as("A new element should have been added as a child")
                    .hasExactlyElementsOfTypes(ElementType.class);

            result1.getComponent().getComponent().get(0).getElement().get(0).setName("first");

            //add another element
            final ComponentSpec result2 = instance.addChildElement(result1, "component.component[0]");
            assertThat(result2)
                    .extracting("component.component").asInstanceOf(LIST)
                    .element(0)
                    //there should be a new child component
                    .extracting("element").asInstanceOf(LIST)
                    .satisfiesExactly(
                            child1 -> {
                                assertThat(child1)
                                        .as("Existing element with name")
                                        .hasFieldOrPropertyWithValue("name", "first");
                            },
                            child2 -> {
                                assertThat(child2)
                                        .extracting("name")
                                        .as("New element without name")
                                        .isNull();
                            }
                    );
        }

        {
            //adding a new empty child element to a component with existing child elements
            final ComponentSpec result = instance.addChildElement(spec, "component.component[1]");
            assertThat(result).isNotNull();
        }

    }

    /**
     * Operations that should fail
     */
    @Test
    public void testAddChildElementIllegally() {
        //Add to element
        {
            ComponentSpecTransformationException exception = assertThrows(
                    ComponentSpecTransformationException.class,
                    () -> {
                        instance.addChildElement(spec, "component.component[1].element[0]");
                    },
                    "Trying to add an element to an element should throw");
            assertThat(exception)
                    .as("message should explain issue")
                    .hasMessageContaining("Could not add item");
        }
        //Add to non-existent
        {
            ComponentSpecTransformationException exception = assertThrows(
                    ComponentSpecTransformationException.class,
                    () -> {
                        instance.addChildElement(spec, "component.component[5]");
                    },
                    "Trying to add an element to a path that does not exist should throw");
            assertThat(exception)
                    .as("message should explain issue")
                    .hasMessageContaining("Could not add item");
        }
    }

}
