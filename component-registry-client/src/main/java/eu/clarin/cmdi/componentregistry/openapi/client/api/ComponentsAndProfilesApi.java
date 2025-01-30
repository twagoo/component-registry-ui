package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;

import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentsList;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ProfileDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ProfilesList;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-30T12:42:47.061619+02:00[Europe/Riga]", comments = "Generator version: 7.11.0")
public class ComponentsAndProfilesApi {
    private ApiClient apiClient;

    public ComponentsAndProfilesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ComponentsAndProfilesApi(ApiClient apiClient) {
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
     * @return ComponentDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentItemRequestCreation(String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ComponentDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/description", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ComponentDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentDescription getComponentItem(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentItemRequestCreation(componentId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;ComponentDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentDescription> getComponentItemWithHttpInfo(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentItemRequestCreation(componentId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentItemWithResponseSpec(String componentId) throws RestClientResponseException {
        return getComponentItemRequestCreation(componentId);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ComponentsList
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentsRequestCreation(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new RestClientResponseException("Missing the required parameter 'status' when calling getComponents", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortDirection", sortDirection));
        
        final String[] localVarAccepts = { 
            "application/json", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ComponentsList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ComponentsList
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentsList getComponents(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentsList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentsRequestCreation(status, sortBy, sortDirection).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ResponseEntity&lt;ComponentsList&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentsList> getComponentsWithHttpInfo(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentsList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentsRequestCreation(status, sortBy, sortDirection).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentsWithResponseSpec(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        return getComponentsRequestCreation(status, sortBy, sortDirection);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ProfileDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProfileItemRequestCreation(String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getProfileItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProfileDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{componentId}/description", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ProfileDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProfileDescription getProfileItem(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ProfileDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfileItemRequestCreation(componentId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;ProfileDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProfileDescription> getProfileItemWithHttpInfo(String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ProfileDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfileItemRequestCreation(componentId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProfileItemWithResponseSpec(String componentId) throws RestClientResponseException {
        return getProfileItemRequestCreation(componentId);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ProfilesList
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProfilesRequestCreation(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new RestClientResponseException("Missing the required parameter 'status' when calling getProfiles", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortDirection", sortDirection));
        
        final String[] localVarAccepts = { 
            "application/json", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProfilesList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ProfilesList
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProfilesList getProfiles(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        ParameterizedTypeReference<ProfilesList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfilesRequestCreation(status, sortBy, sortDirection).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ResponseEntity&lt;ProfilesList&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProfilesList> getProfilesWithHttpInfo(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        ParameterizedTypeReference<ProfilesList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfilesRequestCreation(status, sortBy, sortDirection).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param sortBy The sortBy parameter
     * @param sortDirection The sortDirection parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProfilesWithResponseSpec(List<String> status, String sortBy, String sortDirection) throws RestClientResponseException {
        return getProfilesRequestCreation(status, sortBy, sortDirection);
    }
}
