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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author twagoo
 */
@RestController
public class ComponentBrowserController {

    private final DefaultApi api;

    @Autowired
    public ComponentBrowserController(DefaultApi api) {
        this.api = api;
    }

    @GetMapping("/")
    public String test() {
        final BaseDescription testItem = api.getTestItem();
        return  "<html><body><pre>"+testItem.toString()+"</pre></body></html>";
    }

}
