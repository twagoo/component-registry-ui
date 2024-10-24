package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;

import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T16:54:28.781907+02:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
public class ComponentRegistryControllerApi {
    private ApiClient apiClient;

    public ComponentRegistryControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public ComponentRegistryControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return BaseDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getItemRequestCreation(String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/items/{componentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return BaseDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public BaseDescription getItem(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemRequestCreation(componentId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseDescription> getItemWithHttpInfo(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemRequestCreation(componentId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getItemWithResponseSpec(String componentId) throws RestClientResponseException {
        return getItemRequestCreation(componentId);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getItemSpecRequestCreation(String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getItemSpec", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/items/{componentId}/spec", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getItemSpec(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemSpecRequestCreation(componentId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getItemSpecWithHttpInfo(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemSpecRequestCreation(componentId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getItemSpecWithResponseSpec(String componentId) throws RestClientResponseException {
        return getItemSpecRequestCreation(componentId);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return List&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getItemsRequestCreation(String sortBy, String sortDirection) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortDirection", sortDirection));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/items", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return List&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<BaseDescription> getItems(String sortBy, String sortDirection) throws RestClientResponseException {
        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemsRequestCreation(sortBy, sortDirection).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ResponseEntity&lt;List&lt;BaseDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BaseDescription>> getItemsWithHttpInfo(String sortBy, String sortDirection) throws RestClientResponseException {
        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemsRequestCreation(sortBy, sortDirection).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getItemsWithResponseSpec(String sortBy, String sortDirection) throws RestClientResponseException {
        return getItemsRequestCreation(sortBy, sortDirection);
    }
}
