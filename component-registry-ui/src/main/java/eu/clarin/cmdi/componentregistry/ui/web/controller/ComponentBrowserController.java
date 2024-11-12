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

import com.google.common.collect.ImmutableList;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsControllerApi;
import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
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

    public static final String ITEM_STATUS_PRODUCTION = "production";
    public static final String ITEM_STATUS_QUERY_PARAM = "status";
    public static final List<String> ITEM_STATUS_DEFAULT = ImmutableList.of(ITEM_STATUS_PRODUCTION);

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
    public String browser(@RequestParam MultiValueMap<String, String> params, Model model) {
        setCommonModelAttributes(params, model);
        return "browser/browser";
    }

    @GetMapping(path = "/items")
    public String items(@RequestParam MultiValueMap<String, String> params, Model model) {
        List<BaseDescription> items = getItems(params);

        setCommonModelAttributes(params, model);
        model.addAttribute("items", items);

        return "browser/items";
    }

    private void setCommonModelAttributes(MultiValueMap<String, String> params, Model model) throws RestClientResponseException {
        model.addAttribute("fields", ITEM_TABLE_FIELDS);
        model.addAttribute("type", getFirstOrDefault(params, ITEM_TYPE_QUERY_PARAM, ITEM_TYPE_DEFAULT));
        model.addAttribute("status", params.getOrDefault(ITEM_STATUS_QUERY_PARAM, ITEM_STATUS_DEFAULT));
        model.addAttribute("sortedBy", getFirstOrDefault(params, SORT_BY_QUERY_PARAM, SORT_BY_DEFAULT));
        model.addAttribute("sortedDirection", getFirstOrDefault(params, SORT_DIRECTION_QUERY_PARAM, SORT_DIRECTION_DEFAULT));
    }

    private List<BaseDescription> getItems(MultiValueMap<String, String> params) throws RestClientResponseException {
        final String type = getFirstOrDefault(params, ITEM_TYPE_QUERY_PARAM, ITEM_TYPE_DEFAULT);
        final List<String> status = params.getOrDefault(ITEM_STATUS_QUERY_PARAM, ITEM_STATUS_DEFAULT);
        final String sortBy = getFirstOrDefault(params, SORT_BY_QUERY_PARAM, SORT_BY_DEFAULT);
        final String sortDirection = getFirstOrDefault(params, SORT_DIRECTION_QUERY_PARAM, SORT_DIRECTION_DEFAULT);
        return switch (type) {
            case ITEM_TYPE_COMPONENT ->
                api.getItems("component", status, sortBy, sortDirection);
            case ITEM_TYPE_PROFILE ->
                api.getItems("profile", status, sortBy, sortDirection);
            default ->
                Collections.emptyList();
        };
    }

    private <T> T getFirstOrDefault(MultiValueMap<String, T> map, String key, T defaultValue) {
        return Optional.ofNullable(map.getFirst(key)).orElse(defaultValue);
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
        final ComponentSpec itemSpec
                = api.getItemSpec(id, MediaType.APPLICATION_JSON_VALUE);

        model.addAttribute("spec", itemSpec);
        return "browser/itemSpec";
    }

}
