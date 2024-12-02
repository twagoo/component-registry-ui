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
package eu.clarin.cmdi.componentregistry.ui.web.controller;

import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsControllerApi;
import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author twagoo
 */
@Controller
@RequestMapping(value = "/editor")
@Slf4j
public class EditorController {

    private final ItemsControllerApi api;

    @Autowired
    public EditorController(ItemsControllerApi api) {
        this.api = api;
    }

    @GetMapping(path = "/{itemId}")
    public String browser(@PathVariable String itemId, Model model) throws ErrorResponseException {
        final BaseDescription description = api.getItem(itemId);
        if (description == null) {
            throw new ErrorResponseException(HttpStatus.NOT_FOUND);
        } else {
            final ComponentSpec spec = api.getItemSpec(itemId, MediaType.APPLICATION_JSON_VALUE);

            model.addAttribute("description", description);
            model.addAttribute("spec", spec);

            return "items/editor/editor";
        }
    }

    @PostMapping(path = "/{itemId}/spec")
    public String submitSpec(@PathVariable String itemId, @RequestBody MultiValueMap<String, String> formData, Model model) {
        log.info("Item: {}, Incoming data: {}", itemId, formData);
        
        
        // https://stackoverflow.com/questions/30280131/thymeleaf-spring-nested-backing-object-is-not-binding-the-values-on-form-submit
        return browser(itemId, model);
    }
}
