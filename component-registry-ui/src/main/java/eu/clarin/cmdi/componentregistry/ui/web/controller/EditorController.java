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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.ImmutableMap;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsControllerApi;
import eu.clarin.cmdi.componentregistry.openapi.client.model.Attribute;
import eu.clarin.cmdi.componentregistry.openapi.client.model.Attribute.ValueSchemeEnum;
import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import eu.clarin.cmdi.componentregistry.openapi.client.model.DocumentationType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ElementType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ValueSchemeType;
import eu.clarin.cmdi.componentregistry.ui.service.ComponentSpecTransformationException;
import eu.clarin.cmdi.componentregistry.ui.service.ComponentSpecTransformationService;
import static eu.clarin.cmdi.componentregistry.ui.service.TransformationActions.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author twagoo
 */
@Controller
@RequestMapping(value = "/editor")
@Slf4j
public class EditorController {

    private final ItemsControllerApi api;

    private final ComponentSpecTransformationService specTransformationService;

    @Autowired
    public EditorController(ItemsControllerApi api, ComponentSpecTransformationService specTransformationService) {
        this.api = api;
        this.specTransformationService = specTransformationService;
    }

    @GetMapping(path = "/{itemId}")
    public String editor(@PathVariable String itemId, Model model) throws ErrorResponseException {
        final BaseDescription description = api.getItem(itemId);
        if (description == null) {
            throw new ErrorResponseException(HttpStatus.NOT_FOUND);
        } else {
            final ComponentSpec spec = api.getItemSpec(itemId, MediaType.APPLICATION_JSON_VALUE);

            model.addAttribute("description", description);
            model.addAttribute("spec", spec);

            return "editor/editor";
        }
    }

    @PostMapping(path = "/{itemId}/spec")
    public String submitSpec(@PathVariable String itemId, ComponentSpec formData, BindingResult bindingResult, Model model) {
        log.info("Item: {}, Incoming data: {}", itemId, formData);

        // https://stackoverflow.com/questions/30280131/thymeleaf-spring-nested-backing-object-is-not-binding-the-values-on-form-submit
        return editor(itemId, model);
    }

    @PostMapping(path = "/transform")
    public String performOperation(ComponentSpec spec,
            @RequestParam String operation,
            @RequestParam String path,
            Model model) throws JsonProcessingException, ComponentSpecTransformationException {
        final ComponentSpec transformedSpec = transform(operation, spec, path);

        model.addAttribute("componentId", spec.getHeader().getId());
        model.addAttribute("spec", transformedSpec);

        return "editor/fragments/specForm :: specForm";
    }

    /**
     * GET is supported for /transform for the cases in which the /transform URL
     * is pushed into history
     *
     * @param itemId
     * @return
     */
    @GetMapping(path = "/transform")
    public ModelAndView getOperationResult(@RequestParam(required = false) String itemId) {
        if (itemId == null) {
            return new ModelAndView("redirect:/editor");
        } else {
            return new ModelAndView("redirect:/editor/{itemId}", ImmutableMap.of("itemId", itemId));
        }
    }

    @GetMapping("/referencedComponent/{componentId}")
    public String getReferencedComponent(@PathVariable String componentId, Model model) {
        final ComponentSpec spec = api.getItemSpec(componentId, null);
        model.addAttribute("spec", spec);
        return "/editor/fragments/componentRef :: expandedComponent";
    }

    @PostMapping("/elementValueSchemeEditor")
    public String valueSchemeEditor(ComponentSpec spec, @RequestParam String path, Model model) {
        try {
            final ElementType element = specTransformationService.extractElement(spec, path);
            model.addAttribute("parentType", "element");
            model.addAttribute("parentPath", path);
            model.addAttribute("valueSchemeAttribute", element.getValueSchemeAttribute());
            model.addAttribute("valueScheme", element.getValueScheme());

            return "/editor/fragments/valueScheme :: valueSchemeEditor";
        } catch (ComponentSpecTransformationException | JsonProcessingException ex) {
            log.error("Error while extracting element from spec at path " + path);
            throw new RuntimeException(ex);
        }
    }

    @PostMapping("/elementValueSchemeEditor/simple")
    public String simpleValueScheme(@RequestParam String path, @RequestParam Attribute.ValueSchemeEnum type, Model model) {
        return valueScheme(model, path, type, null);
    }

    @PostMapping("/elementValueSchemeEditor/pattern")
    public String patternValueScheme(@RequestParam String path, @RequestParam String pattern, Model model) {
        final ValueSchemeType valueScheme = new ValueSchemeType();
        valueScheme.setPattern(pattern);

        return valueScheme(model, path, null, valueScheme);
    }

    private String valueScheme(Model model, String path, final Attribute.ValueSchemeEnum valueSchemeAttribute, final ValueSchemeType valueScheme) {
        model.addAttribute("parentPath", path);
        model.addAttribute("valueSchemeAttributePath", path + ".valueSchemeAttribute");
        model.addAttribute("valueSchemeAttributeValue", valueSchemeAttribute);
        model.addAttribute("valueSchemePath", path + ".valueScheme");
        model.addAttribute("valueSchemeValue", valueScheme);

        return "/editor/fragments/valueScheme :: valueScheme";
    }

    private ComponentSpec transform(String operation, ComponentSpec spec, String path) throws ComponentSpecTransformationException, JsonProcessingException {
        return switch (operation) {
            case NOOP ->
                spec;
            case DELETE ->
                specTransformationService.deletePath(spec, path);
            case MOVE_COMPONENT_UP ->
                specTransformationService.moveComponentUp(spec, path);
            case MOVE_COMPONENT_DOWN ->
                specTransformationService.moveComponentDown(spec, path);
            case MOVE_ELEMENT_UP ->
                specTransformationService.moveElementUp(spec, path);
            case MOVE_ELEMENT_DOWN ->
                specTransformationService.moveElementDown(spec, path);
            case MOVE_ATTRIBUTE_UP ->
                specTransformationService.moveAttributeUp(spec, path);
            case MOVE_ATTRIBUTE_DOWN ->
                specTransformationService.moveAttributeDown(spec, path);
            case ADD_CHILD_COMPONENT ->
                specTransformationService.addChildComponent(spec, path);
            case ADD_CHILD_ELEMENT ->
                specTransformationService.addChildElement(spec, path);
            case ADD_CHILD_ATTRIBUTE_TO_COMPONENT ->
                specTransformationService.addChildAttributeToComponent(spec, path);
            case ADD_CHILD_ATTRIBUTE_TO_ELEMENT ->
                specTransformationService.addChildAttributeToElement(spec, path);
            case INSERT_COMPONENT ->
                specTransformationService.insertComponentBefore(spec, path);
            case INSERT_ELEMENT ->
                specTransformationService.insertElementBefore(spec, path);
            default -> {
                //unsupported operation
                throw new ComponentSpecTransformationException("Unsupported operation: " + operation);
            }
        };
    }

    @GetMapping("/newDocumentationElement")
    public String newDocumentationElement(@RequestParam String path, Model model) {
        model.addAttribute("path", path);
        model.addAttribute("doc", new DocumentationType());
        return "/editor/fragments/documentation :: documentationElement";
    }

}
