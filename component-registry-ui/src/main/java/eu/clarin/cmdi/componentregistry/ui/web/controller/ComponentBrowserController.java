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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientResponseException;

/**
 *
 * @author twagoo
 */
@Controller
public class ComponentBrowserController {

    private final ItemsControllerApi api;

    public static final String SORT_BY_QUERY_PARAM = "sortBy";
    public static final String SORT_BY_DEFAULT = "name";
    public static final String SORT_DIRECTION_QUERY_PARAM = "sortDirection";
    public static final String SORT_DIRECTION_DEFAULT = "ASC";
    public static final String ITEM_TYPE_COMPONENT = "component";
    public static final String ITEM_TYPE_PROFILE = "profile";
    public static final String ITEM_TYPE_QUERY_PARAM = "type";
    public static final String ITEM_TYPE_DEFAULT = ITEM_TYPE_PROFILE;

    private static final List<String> ITEM_TABLE_FIELDS = Arrays.asList(
            "name",
            "groupName",
            "domainName",
            "creatorName",
            //            "description",
            "registrationDate");

    @Autowired
    public ComponentBrowserController(ItemsControllerApi api) {
        this.api = api;
    }

    @GetMapping(path = "/")
    public String browser(@RequestParam Map<String, String> params, Model model) {
        setCommonModelAttributes(params, model);
        return "browser/browser";
    }

    @GetMapping(path = "/items")
    public String items(@RequestParam Map<String, String> params, Model model) {
        List<BaseDescription> items = getItems(params);

        setCommonModelAttributes(params, model);
        model.addAttribute("items", items);

        return "browser/items";
    }

    private void setCommonModelAttributes(Map<String, String> params, Model model) throws RestClientResponseException {
        model.addAttribute("fields", ITEM_TABLE_FIELDS);
        model.addAttribute("type", params.getOrDefault(ITEM_TYPE_QUERY_PARAM, ITEM_TYPE_DEFAULT));
        model.addAttribute("sortedBy", params.getOrDefault(SORT_BY_QUERY_PARAM, SORT_BY_DEFAULT));
        model.addAttribute("sortedDirection", params.getOrDefault(SORT_DIRECTION_QUERY_PARAM, SORT_DIRECTION_DEFAULT));
    }

    private List<BaseDescription> getItems(Map<String, String> params) throws RestClientResponseException {
        final String type = params.getOrDefault(ITEM_TYPE_QUERY_PARAM, ITEM_TYPE_DEFAULT);
        final String sortBy = params.getOrDefault(SORT_BY_QUERY_PARAM, SORT_BY_DEFAULT);
        final String sortDirection = params.getOrDefault(SORT_DIRECTION_QUERY_PARAM, SORT_DIRECTION_DEFAULT);
        return switch (type) {
            case ITEM_TYPE_COMPONENT ->
                api.getItems("component", null, sortBy, sortDirection);
            case ITEM_TYPE_PROFILE ->
                api.getItems("profile", null, sortBy, sortDirection);
            default ->
                Collections.emptyList();
        };
    }

    @GetMapping(path = "/item/{id}")
    public String itemDescription(Model model,
            @PathVariable String id) {
        //get item description from API
        final BaseDescription item = api.getItem(id);

        model.addAttribute("item", item);
        return "browser/item";
    }

    @GetMapping(path = "/item/{id}/specification")
    public String itemSpecification(Model model,
            @PathVariable String id) {
        //get item spec from API
        final ComponentSpec itemSpec = 
                api.getItemSpec(id, MediaType.APPLICATION_JSON_VALUE);

        model.addAttribute("spec", itemSpec);
        return "browser/itemSpec";
    }

}
