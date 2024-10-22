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

import eu.clarin.cmdi.componentregistry.openapi.client.api.DefaultApi;
import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientResponseException;

/**
 *
 * @author twagoo
 */
@Controller
public class ComponentBrowserController {

    private final DefaultApi api;

    public static final String SORT_BY_QUERY_PARAM = "sortBy";
    public static final String SORT_BY_DEFAULT = "name";
    public static final String SORT_DIRECTION_QUERY_PARAM = "sortDirection";
    public static final String SORT_DIRECTION_DEFAULT = "ASC";

    private static final List<String> ITEM_TABLE_FIELDS = Arrays.asList(
            "name",
            "groupName",
            "domainName",
            "creatorName",
            "description",
            "registrationDate");

    @Autowired
    public ComponentBrowserController(DefaultApi api) {
        this.api = api;
    }

    private void setCommonModelAttributes(String sortBy, String sortDirection, Model model) throws RestClientResponseException {
        model.addAttribute("fields", ITEM_TABLE_FIELDS);
        model.addAttribute("sortedBy", sortBy);
        model.addAttribute("sortedDirection", sortDirection);
    }

    @GetMapping(path = "/")
    public String browser(Model model,
            @RequestParam(name = SORT_BY_QUERY_PARAM,
                    defaultValue = SORT_BY_DEFAULT) String sortBy,
            @RequestParam(name = SORT_DIRECTION_QUERY_PARAM,
                    defaultValue = SORT_DIRECTION_DEFAULT) String sortDirection) {
        setCommonModelAttributes(sortBy, sortDirection, model);
        return "browser/browser";
    }

    @GetMapping(path = "/items")
    public String items(Model model,
            @RequestParam(name = SORT_BY_QUERY_PARAM,
                    defaultValue = SORT_BY_DEFAULT) String sortBy,
            @RequestParam(name = SORT_DIRECTION_QUERY_PARAM,
                    defaultValue = SORT_DIRECTION_DEFAULT) String sortDirection) {
        final List<BaseDescription> items = api.getItems(sortBy, sortDirection);

        setCommonModelAttributes(sortBy, sortDirection, model);
        model.addAttribute("items", items);

        return "browser/items";
    }

}
