/*
 * Component Registry API
 * Components and profiles registry for the Component Metadata Infrastructure
 *
 * The version of the OpenAPI document: 1.0
 * Contact: cmdi@clarin.eu
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.clarin.cmdi.componentregistry.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import eu.clarin.cmdi.componentregistry.openapi.client.model.AttributeListType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.DocumentationType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * ComponentType
 */
@JsonPropertyOrder({
  ComponentType.JSON_PROPERTY_DOCUMENTATION,
  ComponentType.JSON_PROPERTY_ATTRIBUTE_LIST,
  ComponentType.JSON_PROPERTY_ELEMENT,
  ComponentType.JSON_PROPERTY_COMPONENT,
  ComponentType.JSON_PROPERTY_NAME,
  ComponentType.JSON_PROPERTY_COMPONENT_REF,
  ComponentType.JSON_PROPERTY_CONCEPT_LINK,
  ComponentType.JSON_PROPERTY_CARDINALITY_MIN,
  ComponentType.JSON_PROPERTY_CARDINALITY_MAX,
  ComponentType.JSON_PROPERTY_BASE,
  ComponentType.JSON_PROPERTY_OTHER_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T11:08:44.298260+02:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
@XmlRootElement(name = "ComponentType")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "ComponentType")
public class ComponentType {
  public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
  @XmlElement(name = "Documentation")
  private List<DocumentationType> documentation = new ArrayList<>();

  public static final String JSON_PROPERTY_ATTRIBUTE_LIST = "attributeList";
  @XmlElement(name = "attributeList")
  private AttributeListType attributeList;

  public static final String JSON_PROPERTY_ELEMENT = "element";
  @XmlElement(name = "Element")
  private List<ElementType> element = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPONENT = "component";
  @XmlElement(name = "Component")
  private List<ComponentType> component = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @XmlAttribute(name = "name")
  private String name;

  public static final String JSON_PROPERTY_COMPONENT_REF = "componentRef";
  @XmlAttribute(name = "ComponentRef")
  private String componentRef;

  public static final String JSON_PROPERTY_CONCEPT_LINK = "conceptLink";
  @XmlAttribute(name = "ConceptLink")
  private String conceptLink;

  public static final String JSON_PROPERTY_CARDINALITY_MIN = "cardinalityMin";
  @XmlElement(name = "cardinalityMin")
  private List<String> cardinalityMin = new ArrayList<>();

  public static final String JSON_PROPERTY_CARDINALITY_MAX = "cardinalityMax";
  @XmlElement(name = "cardinalityMax")
  private List<String> cardinalityMax = new ArrayList<>();

  public static final String JSON_PROPERTY_BASE = "base";
  @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
  private String base;

  public static final String JSON_PROPERTY_OTHER_ATTRIBUTES = "otherAttributes";
  @XmlElement(name = "otherAttributes")
  private Map<String, String> otherAttributes = new HashMap<>();

  public ComponentType() {
  }

  public ComponentType documentation(List<DocumentationType> documentation) {
    
    this.documentation = documentation;
    return this;
  }

  public ComponentType addDocumentationItem(DocumentationType documentationItem) {
    if (this.documentation == null) {
      this.documentation = new ArrayList<>();
    }
    this.documentation.add(documentationItem);
    return this;
  }

  /**
   * Get documentation
   * @return documentation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Documentation")
  @JacksonXmlElementWrapper(useWrapping = false)

  public List<DocumentationType> getDocumentation() {
    return documentation;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Documentation")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setDocumentation(List<DocumentationType> documentation) {
    this.documentation = documentation;
  }

  public ComponentType attributeList(AttributeListType attributeList) {
    
    this.attributeList = attributeList;
    return this;
  }

  /**
   * Get attributeList
   * @return attributeList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "attributeList")

  public AttributeListType getAttributeList() {
    return attributeList;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "attributeList")
  public void setAttributeList(AttributeListType attributeList) {
    this.attributeList = attributeList;
  }

  public ComponentType element(List<ElementType> element) {
    
    this.element = element;
    return this;
  }

  public ComponentType addElementItem(ElementType elementItem) {
    if (this.element == null) {
      this.element = new ArrayList<>();
    }
    this.element.add(elementItem);
    return this;
  }

  /**
   * Get element
   * @return element
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Element")
  @JacksonXmlElementWrapper(useWrapping = false)

  public List<ElementType> getElement() {
    return element;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Element")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setElement(List<ElementType> element) {
    this.element = element;
  }

  public ComponentType component(List<ComponentType> component) {
    
    this.component = component;
    return this;
  }

  public ComponentType addComponentItem(ComponentType componentItem) {
    if (this.component == null) {
      this.component = new ArrayList<>();
    }
    this.component.add(componentItem);
    return this;
  }

  /**
   * Get component
   * @return component
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Component")
  @JacksonXmlElementWrapper(useWrapping = false)

  public List<ComponentType> getComponent() {
    return component;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Component")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setComponent(List<ComponentType> component) {
    this.component = component;
  }

  public ComponentType name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "name", isAttribute = true)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "name", isAttribute = true)
  public void setName(String name) {
    this.name = name;
  }

  public ComponentType componentRef(String componentRef) {
    
    this.componentRef = componentRef;
    return this;
  }

  /**
   * Get componentRef
   * @return componentRef
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "ComponentRef", isAttribute = true)

  public String getComponentRef() {
    return componentRef;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "ComponentRef", isAttribute = true)
  public void setComponentRef(String componentRef) {
    this.componentRef = componentRef;
  }

  public ComponentType conceptLink(String conceptLink) {
    
    this.conceptLink = conceptLink;
    return this;
  }

  /**
   * Get conceptLink
   * @return conceptLink
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONCEPT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "ConceptLink", isAttribute = true)

  public String getConceptLink() {
    return conceptLink;
  }


  @JsonProperty(JSON_PROPERTY_CONCEPT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "ConceptLink", isAttribute = true)
  public void setConceptLink(String conceptLink) {
    this.conceptLink = conceptLink;
  }

  public ComponentType cardinalityMin(List<String> cardinalityMin) {
    
    this.cardinalityMin = cardinalityMin;
    return this;
  }

  public ComponentType addCardinalityMinItem(String cardinalityMinItem) {
    if (this.cardinalityMin == null) {
      this.cardinalityMin = new ArrayList<>();
    }
    this.cardinalityMin.add(cardinalityMinItem);
    return this;
  }

  /**
   * Get cardinalityMin
   * @return cardinalityMin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARDINALITY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "cardinalityMin")
  @JacksonXmlElementWrapper(useWrapping = false)

  public List<String> getCardinalityMin() {
    return cardinalityMin;
  }


  @JsonProperty(JSON_PROPERTY_CARDINALITY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "cardinalityMin")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setCardinalityMin(List<String> cardinalityMin) {
    this.cardinalityMin = cardinalityMin;
  }

  public ComponentType cardinalityMax(List<String> cardinalityMax) {
    
    this.cardinalityMax = cardinalityMax;
    return this;
  }

  public ComponentType addCardinalityMaxItem(String cardinalityMaxItem) {
    if (this.cardinalityMax == null) {
      this.cardinalityMax = new ArrayList<>();
    }
    this.cardinalityMax.add(cardinalityMaxItem);
    return this;
  }

  /**
   * Get cardinalityMax
   * @return cardinalityMax
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARDINALITY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "cardinalityMax")
  @JacksonXmlElementWrapper(useWrapping = false)

  public List<String> getCardinalityMax() {
    return cardinalityMax;
  }


  @JsonProperty(JSON_PROPERTY_CARDINALITY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "cardinalityMax")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setCardinalityMax(List<String> cardinalityMax) {
    this.cardinalityMax = cardinalityMax;
  }

  public ComponentType base(String base) {
    
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "base", isAttribute = true, namespace = "http://www.w3.org/XML/1998/namespace")

  public String getBase() {
    return base;
  }


  @JsonProperty(JSON_PROPERTY_BASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "base", isAttribute = true, namespace = "http://www.w3.org/XML/1998/namespace")
  public void setBase(String base) {
    this.base = base;
  }

  public ComponentType otherAttributes(Map<String, String> otherAttributes) {
    
    this.otherAttributes = otherAttributes;
    return this;
  }

  public ComponentType putOtherAttributesItem(String key, String otherAttributesItem) {
    if (this.otherAttributes == null) {
      this.otherAttributes = new HashMap<>();
    }
    this.otherAttributes.put(key, otherAttributesItem);
    return this;
  }

  /**
   * Get otherAttributes
   * @return otherAttributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "otherAttributes")
  @JacksonXmlElementWrapper(useWrapping = false)

  public Map<String, String> getOtherAttributes() {
    return otherAttributes;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "otherAttributes")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setOtherAttributes(Map<String, String> otherAttributes) {
    this.otherAttributes = otherAttributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentType componentType = (ComponentType) o;
    return Objects.equals(this.documentation, componentType.documentation) &&
        Objects.equals(this.attributeList, componentType.attributeList) &&
        Objects.equals(this.element, componentType.element) &&
        Objects.equals(this.component, componentType.component) &&
        Objects.equals(this.name, componentType.name) &&
        Objects.equals(this.componentRef, componentType.componentRef) &&
        Objects.equals(this.conceptLink, componentType.conceptLink) &&
        Objects.equals(this.cardinalityMin, componentType.cardinalityMin) &&
        Objects.equals(this.cardinalityMax, componentType.cardinalityMax) &&
        Objects.equals(this.base, componentType.base) &&
        Objects.equals(this.otherAttributes, componentType.otherAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentation, attributeList, element, component, name, componentRef, conceptLink, cardinalityMin, cardinalityMax, base, otherAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentType {\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    attributeList: ").append(toIndentedString(attributeList)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    componentRef: ").append(toIndentedString(componentRef)).append("\n");
    sb.append("    conceptLink: ").append(toIndentedString(conceptLink)).append("\n");
    sb.append("    cardinalityMin: ").append(toIndentedString(cardinalityMin)).append("\n");
    sb.append("    cardinalityMax: ").append(toIndentedString(cardinalityMax)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    otherAttributes: ").append(toIndentedString(otherAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

