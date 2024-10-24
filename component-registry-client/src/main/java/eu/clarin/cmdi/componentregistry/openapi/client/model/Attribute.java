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
import eu.clarin.cmdi.componentregistry.openapi.client.model.DocumentationType;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ValueSchemeType;
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
 * Attribute
 */
@JsonPropertyOrder({
  Attribute.JSON_PROPERTY_DOCUMENTATION,
  Attribute.JSON_PROPERTY_ATTRIBUTE_VALUE_SCHEME,
  Attribute.JSON_PROPERTY_AUTO_VALUE,
  Attribute.JSON_PROPERTY_NAME,
  Attribute.JSON_PROPERTY_CONCEPT_LINK,
  Attribute.JSON_PROPERTY_VALUE_SCHEME,
  Attribute.JSON_PROPERTY_REQUIRED,
  Attribute.JSON_PROPERTY_OTHER_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T11:08:44.298260+02:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
@XmlRootElement(name = "Attribute")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Attribute")
public class Attribute {
  public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
  @XmlElement(name = "Documentation")
  private List<DocumentationType> documentation = new ArrayList<>();

  public static final String JSON_PROPERTY_ATTRIBUTE_VALUE_SCHEME = "attributeValueScheme";
  @XmlElement(name = "attributeValueScheme")
  private ValueSchemeType attributeValueScheme;

  public static final String JSON_PROPERTY_AUTO_VALUE = "autoValue";
  @XmlElement(name = "AutoValue")
  private List<String> autoValue = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @XmlAttribute(name = "name")
  private String name;

  public static final String JSON_PROPERTY_CONCEPT_LINK = "conceptLink";
  @XmlAttribute(name = "ConceptLink")
  private String conceptLink;

  /**
   * Gets or Sets valueScheme
   */
  @XmlType(name="ValueSchemeEnum")
  @XmlEnum(String.class)
  public enum ValueSchemeEnum {
    @XmlEnumValue("BOOLEAN")
    BOOLEAN("BOOLEAN"),
    
    @XmlEnumValue("DECIMAL")
    DECIMAL("DECIMAL"),
    
    @XmlEnumValue("FLOAT")
    FLOAT("FLOAT"),
    
    @XmlEnumValue("INT")
    INT("INT"),
    
    @XmlEnumValue("STRING")
    STRING("STRING"),
    
    @XmlEnumValue("ANY_URI")
    ANY_URI("ANY_URI"),
    
    @XmlEnumValue("DATE")
    DATE("DATE"),
    
    @XmlEnumValue("G_DAY")
    G_DAY("G_DAY"),
    
    @XmlEnumValue("G_MONTH")
    G_MONTH("G_MONTH"),
    
    @XmlEnumValue("G_YEAR")
    G_YEAR("G_YEAR"),
    
    @XmlEnumValue("TIME")
    TIME("TIME"),
    
    @XmlEnumValue("DATE_TIME")
    DATE_TIME("DATE_TIME");

    private String value;

    ValueSchemeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueSchemeEnum fromValue(String value) {
      for (ValueSchemeEnum b : ValueSchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUE_SCHEME = "valueScheme";
  @XmlAttribute(name = "ValueScheme")
  private ValueSchemeEnum valueScheme;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  @XmlAttribute(name = "Required")
  private Boolean required;

  public static final String JSON_PROPERTY_OTHER_ATTRIBUTES = "otherAttributes";
  @XmlElement(name = "otherAttributes")
  private Map<String, String> otherAttributes = new HashMap<>();

  public Attribute() {
  }

  public Attribute documentation(List<DocumentationType> documentation) {
    
    this.documentation = documentation;
    return this;
  }

  public Attribute addDocumentationItem(DocumentationType documentationItem) {
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

  public Attribute attributeValueScheme(ValueSchemeType attributeValueScheme) {
    
    this.attributeValueScheme = attributeValueScheme;
    return this;
  }

  /**
   * Get attributeValueScheme
   * @return attributeValueScheme
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "attributeValueScheme")

  public ValueSchemeType getAttributeValueScheme() {
    return attributeValueScheme;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "attributeValueScheme")
  public void setAttributeValueScheme(ValueSchemeType attributeValueScheme) {
    this.attributeValueScheme = attributeValueScheme;
  }

  public Attribute autoValue(List<String> autoValue) {
    
    this.autoValue = autoValue;
    return this;
  }

  public Attribute addAutoValueItem(String autoValueItem) {
    if (this.autoValue == null) {
      this.autoValue = new ArrayList<>();
    }
    this.autoValue.add(autoValueItem);
    return this;
  }

  /**
   * Get autoValue
   * @return autoValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "AutoValue")
  @JacksonXmlElementWrapper(useWrapping = false)

  public List<String> getAutoValue() {
    return autoValue;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "AutoValue")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setAutoValue(List<String> autoValue) {
    this.autoValue = autoValue;
  }

  public Attribute name(String name) {
    
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

  public Attribute conceptLink(String conceptLink) {
    
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

  public Attribute valueScheme(ValueSchemeEnum valueScheme) {
    
    this.valueScheme = valueScheme;
    return this;
  }

  /**
   * Get valueScheme
   * @return valueScheme
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "ValueScheme", isAttribute = true)

  public ValueSchemeEnum getValueScheme() {
    return valueScheme;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "ValueScheme", isAttribute = true)
  public void setValueScheme(ValueSchemeEnum valueScheme) {
    this.valueScheme = valueScheme;
  }

  public Attribute required(Boolean required) {
    
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Required", isAttribute = true)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Required", isAttribute = true)
  public void setRequired(Boolean required) {
    this.required = required;
  }

  public Attribute otherAttributes(Map<String, String> otherAttributes) {
    
    this.otherAttributes = otherAttributes;
    return this;
  }

  public Attribute putOtherAttributesItem(String key, String otherAttributesItem) {
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
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.documentation, attribute.documentation) &&
        Objects.equals(this.attributeValueScheme, attribute.attributeValueScheme) &&
        Objects.equals(this.autoValue, attribute.autoValue) &&
        Objects.equals(this.name, attribute.name) &&
        Objects.equals(this.conceptLink, attribute.conceptLink) &&
        Objects.equals(this.valueScheme, attribute.valueScheme) &&
        Objects.equals(this.required, attribute.required) &&
        Objects.equals(this.otherAttributes, attribute.otherAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentation, attributeValueScheme, autoValue, name, conceptLink, valueScheme, required, otherAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    attributeValueScheme: ").append(toIndentedString(attributeValueScheme)).append("\n");
    sb.append("    autoValue: ").append(toIndentedString(autoValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conceptLink: ").append(toIndentedString(conceptLink)).append("\n");
    sb.append("    valueScheme: ").append(toIndentedString(valueScheme)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

