package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;


import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T13:10:36.372458+03:00[Europe/Riga]", comments = "Generator version: 7.8.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * A listing of values that are allowed as element or attribute type by the CMDI schema
     * 
     * <p><b>200</b> - successful operation
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAllowedAttributeTypesRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/allowedTypes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of values that are allowed as element or attribute type by the CMDI schema
     * 
     * <p><b>200</b> - successful operation
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object getAllowedAttributeTypes() throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAllowedAttributeTypesRequestCreation().body(localVarReturnType);
    }

    /**
     * A listing of values that are allowed as element or attribute type by the CMDI schema
     * 
     * <p><b>200</b> - successful operation
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getAllowedAttributeTypesWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAllowedAttributeTypesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * A listing of values that are allowed as element or attribute type by the CMDI schema
     * 
     * <p><b>200</b> - successful operation
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAllowedAttributeTypesWithResponseSpec() throws RestClientResponseException {
        return getAllowedAttributeTypesRequestCreation();
    }
}
