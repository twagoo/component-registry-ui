/*
 * Copyright (C) 2025 CLARIN ERIC
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

import eu.clarin.cmdi.componentregistry.openapi.client.model.Attribute;
import eu.clarin.cmdi.componentregistry.openapi.client.model.AttributeListType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ElementType;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.springframework.stereotype.Component;

/**
 *
 * @author twagoo
 */
@Component
public class SpecPartsFactory {

    /**
     * Creates a new, initialized Element
     *
     * @return
     */
    public ElementType newElement() {
        final ElementType element = new ElementType();

        // default display priority of '1'
        element.getOtherAttributes().put("{http://www.clarin.eu/cmd/cues/1}DisplayPriority", "1");
        return element;
    }

    /**
     * Creates a new, initialized Component
     *
     * @return
     */
    public ComponentType newComponent() {
        return new ComponentType();
    }

    public Attribute newAttribute() {
        return new Attribute();
    }

    public void addToAttributeList(Supplier<AttributeListType> getter, Consumer<AttributeListType> setter) {
        //use existing list if present, otherwise make a new one
        final AttributeListType list
                = Optional.ofNullable(getter.get())
                        .orElse(new AttributeListType());
        //add the attribute
        setter.accept(list.addAttributeItem(newAttribute()));
    }
}
