package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;

import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-19T17:30:48.787053+03:00[Europe/Riga]", comments = "Generator version: 7.8.0")
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
     * 
     * 
     * <p><b>0</b> - default response
     * @param path The path parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getExternalGrammarRequestCreation(String path) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new RestClientResponseException("Missing the required parameter 'path' when calling getExternalGrammar", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("path", path);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/rest/application.wadl/{path}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @param path The path parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getExternalGrammar(String path) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getExternalGrammarRequestCreation(path).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @param path The path parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getExternalGrammarWithHttpInfo(String path) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getExternalGrammarRequestCreation(path).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @param path The path parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getExternalGrammarWithResponseSpec(String path) throws RestClientResponseException {
        return getExternalGrammarRequestCreation(path);
    }
    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @return BaseDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTestItemRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/rest/registry/test", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @return BaseDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public BaseDescription getTestItem() throws RestClientResponseException {
        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTestItemRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @return ResponseEntity&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseDescription> getTestItemWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTestItemRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTestItemWithResponseSpec() throws RestClientResponseException {
        return getTestItemRequestCreation();
    }
    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWadlRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/vnd.sun.wadl+xml", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/rest/application.wadl", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getWadl() throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getWadlRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getWadlWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWadlRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - default response
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWadlWithResponseSpec() throws RestClientResponseException {
        return getWadlRequestCreation();
    }
}
