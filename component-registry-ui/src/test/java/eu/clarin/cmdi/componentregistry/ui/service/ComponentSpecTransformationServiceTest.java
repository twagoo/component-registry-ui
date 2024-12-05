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
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ElementType;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.LIST;
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

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
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
        ComponentSpecTransformationService instance = new ComponentSpecTransformationService(objectMapper);
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
        ComponentSpecTransformationService instance = new ComponentSpecTransformationService(objectMapper);
        ComponentSpec intermediate = instance.deletePath(spec, "component.component[1].element[1]");
        ComponentSpec result = instance.deletePath(intermediate, "component.component[0]");

        //components directly below root component
        assertThat(result.getComponent().getComponent())
                .hasSize(2)
                .extracting("name")
                .containsAll(ImmutableList.of("two", "three"));

        //elements of component "two"
        assertThat(result)
                .extracting("component.component")
                .asInstanceOf(LIST).element(0) // because of deletion of "one", "two" is now at [0]
                .extracting("element").asInstanceOf(LIST)
                .hasSize(2)
                .extracting("name")
                .containsAll(ImmutableList.of("one", "three"));
    }

}
