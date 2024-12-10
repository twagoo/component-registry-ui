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
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentType;
import org.springframework.stereotype.Service;

/**
 *
 * @author twagoo
 */
@Service
public class ComponentSpecTransformationService {

    private final ObjectMapper objectMapper;

    public ComponentSpecTransformationService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ComponentSpec deletePath(ComponentSpec spec, String path) throws JsonProcessingException {
        final String json = objectMapper.writeValueAsString(spec);
        final DocumentContext doc = JsonPath.parse(json);

        if (path != null) {
            // remove node at path
            doc.delete("$." + path, new Predicate[]{});
        }

        //convert doc back to object
        return objectMapper.readValue(doc.jsonString(), ComponentSpec.class);
    }

    public ComponentSpec addChildComponent(ComponentSpec spec, String path) throws JsonProcessingException, ComponentSpecTransformationException {
        final String json = objectMapper.writeValueAsString(spec);
        final DocumentContext doc = JsonPath.parse(json);

        final ComponentType parent = doc.read("$." + path, ComponentType.class);
        if (parent == null) {
            throw new ComponentSpecTransformationException(String.format("Cannot add a component to spec at [%s]: path does not resolve to a component", path));
        } else {
            parent.addComponentItem(new ComponentType());
            doc.set("$." + path, parent);

            return objectMapper.readValue(doc.jsonString(), ComponentSpec.class);
        }
    }

}
