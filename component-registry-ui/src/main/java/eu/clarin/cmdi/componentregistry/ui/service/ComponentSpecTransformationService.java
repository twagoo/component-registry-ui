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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.JsonPathException;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.TypeRef;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ElementType;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author twagoo
 */
@Service
@Slf4j
public class ComponentSpecTransformationService {

    private final ObjectMapper objectMapper;
    private final Configuration configuration;

    public ComponentSpecTransformationService(ObjectMapper objectMapper, com.jayway.jsonpath.Configuration jsonPathConfiguration) {
        this.objectMapper = objectMapper;
        this.configuration = jsonPathConfiguration;
    }

    public ComponentSpec deletePath(ComponentSpec spec, String path) throws JsonProcessingException {
        final DocumentContext doc = readSpecAsJson(spec);
        if (path != null) {
            // remove node at path
            doc.delete("$." + path, new Predicate[]{});
        }

        //convert doc back to object
        return objectMapper.readValue(doc.jsonString(), ComponentSpec.class);
    }

    public ComponentSpec addChildComponent(ComponentSpec spec, String path) throws JsonProcessingException, ComponentSpecTransformationException {
        return addChildItemToComponent(spec, path,
                parent -> parent.addComponentItem(new ComponentType())
        );
    }

    public ComponentSpec addChildElement(ComponentSpec spec, String path) throws JsonProcessingException, ComponentSpecTransformationException {
        return addChildItemToComponent(spec, path,
                parent -> parent.addElementItem(new ElementType())
        );
    }

    private ComponentSpec addChildItemToComponent(ComponentSpec spec, String path, Consumer<ComponentType> addLogic) throws JsonProcessingException, ComponentSpecTransformationException {
        final DocumentContext doc = readSpecAsJson(spec);
        try {
            final ComponentType parent = doc.read("$." + path, ComponentType.class);

            if (parent != null) {
                addLogic.accept(parent);
                doc.set("$." + path, parent);

                return objectMapper.readValue(doc.jsonString(), ComponentSpec.class);
            }
        } catch (JsonProcessingException | JsonPathException ex) {
            log.warn("Failed to add item at path: " + path, ex);
        }
        throw new ComponentSpecTransformationException(String.format("Could not add item to to spec at [%s]", path));
    }

    public ComponentSpec insertComponentBefore(ComponentSpec spec, String path) throws JsonProcessingException, ComponentSpecTransformationException {
        final DocumentContext doc = readSpecAsJson(spec);

        //extract index
        final Pattern arrayPattern = Pattern.compile("(.*)\\[(\\d)\\]$");
        final Matcher matcher = arrayPattern.matcher(path);
        if (matcher.matches()) {
            try {
                final String arrayPath = matcher.group(1);
                final String indexString = matcher.group(2);
                if (arrayPath != null && indexString != null) {
                    final int index = Integer.parseInt(indexString);
                    //get containing list
                    final List containerArray = doc.read(arrayPath, new TypeRef<List<ComponentType>>() {
                    });
                    //insert item
                    containerArray.add(index, new ComponentType());
                    //replace in context
                    doc.set(arrayPath, containerArray);
                    return objectMapper.readValue(doc.jsonString(), ComponentSpec.class);
                }
            } catch (JsonProcessingException | JsonPathException | IndexOutOfBoundsException ex) {
                log.warn("Failed to add item at path: " + path, ex);
            } catch (NumberFormatException ex) {
                log.error("Not a valid index in path:" + path);
            }
        }
        throw new ComponentSpecTransformationException(String.format("Could not insert an item before %s: not an item in an array", path));

    }

    private DocumentContext readSpecAsJson(ComponentSpec spec) throws JsonProcessingException {
        final String json = objectMapper.writeValueAsString(spec);
        final DocumentContext doc = JsonPath.parse(json, configuration);
        return doc;
    }

}
