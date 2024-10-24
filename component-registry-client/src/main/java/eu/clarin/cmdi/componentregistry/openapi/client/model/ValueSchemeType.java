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
import eu.clarin.cmdi.componentregistry.openapi.client.model.VocabularyType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * ValueSchemeType
 */
@JsonPropertyOrder({
  ValueSchemeType.JSON_PROPERTY_PATTERN,
  ValueSchemeType.JSON_PROPERTY_VOCABULARY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T11:08:44.298260+02:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
@XmlRootElement(name = "ValueSchemeType")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "ValueSchemeType")
public class ValueSchemeType {
  public static final String JSON_PROPERTY_PATTERN = "pattern";
  @XmlElement(name = "pattern")
  private String pattern;

  public static final String JSON_PROPERTY_VOCABULARY = "vocabulary";
  @XmlElement(name = "vocabulary")
  private VocabularyType vocabulary;

  public ValueSchemeType() {
  }

  public ValueSchemeType pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "pattern")

  public String getPattern() {
    return pattern;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "pattern")
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public ValueSchemeType vocabulary(VocabularyType vocabulary) {
    
    this.vocabulary = vocabulary;
    return this;
  }

  /**
   * Get vocabulary
   * @return vocabulary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOCABULARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "vocabulary")

  public VocabularyType getVocabulary() {
    return vocabulary;
  }


  @JsonProperty(JSON_PROPERTY_VOCABULARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "vocabulary")
  public void setVocabulary(VocabularyType vocabulary) {
    this.vocabulary = vocabulary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueSchemeType valueSchemeType = (ValueSchemeType) o;
    return Objects.equals(this.pattern, valueSchemeType.pattern) &&
        Objects.equals(this.vocabulary, valueSchemeType.vocabulary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, vocabulary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueSchemeType {\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    vocabulary: ").append(toIndentedString(vocabulary)).append("\n");
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

