package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;

import eu.clarin.cmdi.componentregistry.openapi.client.model.Group;

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
public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns a listing of groups the current user is a member of (empty list when unauthenticated)
     * 
     * <p><b>200</b> - successful operation
     * @return List&lt;Group&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGroupsTheCurrentUserIsAMemberOfRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<List<Group>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/groups/usermembership", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a listing of groups the current user is a member of (empty list when unauthenticated)
     * 
     * <p><b>200</b> - successful operation
     * @return List&lt;Group&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroupsTheCurrentUserIsAMemberOf() throws RestClientResponseException {
        ParameterizedTypeReference<List<Group>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGroupsTheCurrentUserIsAMemberOfRequestCreation().body(localVarReturnType);
    }

    /**
     * Returns a listing of groups the current user is a member of (empty list when unauthenticated)
     * 
     * <p><b>200</b> - successful operation
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> getGroupsTheCurrentUserIsAMemberOfWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<Group>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGroupsTheCurrentUserIsAMemberOfRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Returns a listing of groups the current user is a member of (empty list when unauthenticated)
     * 
     * <p><b>200</b> - successful operation
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGroupsTheCurrentUserIsAMemberOfWithResponseSpec() throws RestClientResponseException {
        return getGroupsTheCurrentUserIsAMemberOfRequestCreation();
    }
}
