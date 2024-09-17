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
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Information on the current authentication state. Pass &#39;redirect&#39; query parameter to make this method redirect to the URI specified as its value.
     * 
     * <p><b>200</b> - If no query parameters are passed, with the authentications status in its body
     * <p><b>303</b> - A redirect to the URI provided as the value of the &#39;redirect&#39; parameter
     * @param redirect The redirect parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAuthenticationInformationRequestCreation(String redirect) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "redirect", redirect));
        
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/authentication", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Information on the current authentication state. Pass &#39;redirect&#39; query parameter to make this method redirect to the URI specified as its value.
     * 
     * <p><b>200</b> - If no query parameters are passed, with the authentications status in its body
     * <p><b>303</b> - A redirect to the URI provided as the value of the &#39;redirect&#39; parameter
     * @param redirect The redirect parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getAuthenticationInformation(String redirect) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getAuthenticationInformationRequestCreation(redirect).body(localVarReturnType);
    }

    /**
     * Information on the current authentication state. Pass &#39;redirect&#39; query parameter to make this method redirect to the URI specified as its value.
     * 
     * <p><b>200</b> - If no query parameters are passed, with the authentications status in its body
     * <p><b>303</b> - A redirect to the URI provided as the value of the &#39;redirect&#39; parameter
     * @param redirect The redirect parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getAuthenticationInformationWithHttpInfo(String redirect) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAuthenticationInformationRequestCreation(redirect).toEntity(localVarReturnType);
    }

    /**
     * Information on the current authentication state. Pass &#39;redirect&#39; query parameter to make this method redirect to the URI specified as its value.
     * 
     * <p><b>200</b> - If no query parameters are passed, with the authentications status in its body
     * <p><b>303</b> - A redirect to the URI provided as the value of the &#39;redirect&#39; parameter
     * @param redirect The redirect parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAuthenticationInformationWithResponseSpec(String redirect) throws RestClientResponseException {
        return getAuthenticationInformationRequestCreation(redirect);
    }
    /**
     * Triggers the service to require the client to authenticate by means of the configured authentication mechanism. Notice that this might require user interaction!
     * 
     * <p><b>303</b> - A redirect, either to a Shibboleth authentication page/discovery service or other identification mechanism, and ultimately to the same URI as requested (which should be picked up as a GET)
     * <p><b>401</b> - If unauthenticated, a request to authenticate may be returned (not in case of Shibboleth authentication)
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec triggerAuthenticationRequestRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/authentication", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Triggers the service to require the client to authenticate by means of the configured authentication mechanism. Notice that this might require user interaction!
     * 
     * <p><b>303</b> - A redirect, either to a Shibboleth authentication page/discovery service or other identification mechanism, and ultimately to the same URI as requested (which should be picked up as a GET)
     * <p><b>401</b> - If unauthenticated, a request to authenticate may be returned (not in case of Shibboleth authentication)
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void triggerAuthenticationRequest() throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        triggerAuthenticationRequestRequestCreation().body(localVarReturnType);
    }

    /**
     * Triggers the service to require the client to authenticate by means of the configured authentication mechanism. Notice that this might require user interaction!
     * 
     * <p><b>303</b> - A redirect, either to a Shibboleth authentication page/discovery service or other identification mechanism, and ultimately to the same URI as requested (which should be picked up as a GET)
     * <p><b>401</b> - If unauthenticated, a request to authenticate may be returned (not in case of Shibboleth authentication)
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> triggerAuthenticationRequestWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return triggerAuthenticationRequestRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Triggers the service to require the client to authenticate by means of the configured authentication mechanism. Notice that this might require user interaction!
     * 
     * <p><b>303</b> - A redirect, either to a Shibboleth authentication page/discovery service or other identification mechanism, and ultimately to the same URI as requested (which should be picked up as a GET)
     * <p><b>401</b> - If unauthenticated, a request to authenticate may be returned (not in case of Shibboleth authentication)
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec triggerAuthenticationRequestWithResponseSpec() throws RestClientResponseException {
        return triggerAuthenticationRequestRequestCreation();
    }
}
