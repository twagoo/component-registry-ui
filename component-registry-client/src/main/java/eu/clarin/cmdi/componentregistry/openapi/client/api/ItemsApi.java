package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;

import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.Group;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ItemRights;

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
public class ItemsApi {
    private ApiClient apiClient;

    public ItemsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ItemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * The description (metadata) of a single component or profile item
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param itemId The itemId parameter
     * @return BaseDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBaseDescriptionRequestCreation(String itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getBaseDescription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

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

        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/items/{itemId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The description (metadata) of a single component or profile item
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param itemId The itemId parameter
     * @return BaseDescription
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public BaseDescription getBaseDescription(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getBaseDescriptionRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * The description (metadata) of a single component or profile item
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseDescription> getBaseDescriptionWithHttpInfo(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<BaseDescription> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getBaseDescriptionRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * The description (metadata) of a single component or profile item
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param itemId The itemId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBaseDescriptionWithResponseSpec(String itemId) throws RestClientResponseException {
        return getBaseDescriptionRequestCreation(itemId);
    }
    /**
     * Returns a listing of groups to which an item belongs
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return List&lt;Group&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGroupsTheItemIsAMemberOfRequestCreation(String itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getGroupsTheItemIsAMemberOf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

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
        return apiClient.invokeAPI("/items/{itemId}/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a listing of groups to which an item belongs
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return List&lt;Group&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroupsTheItemIsAMemberOf(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Group>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGroupsTheItemIsAMemberOfRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Returns a listing of groups to which an item belongs
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> getGroupsTheItemIsAMemberOfWithHttpInfo(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Group>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGroupsTheItemIsAMemberOfRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Returns a listing of groups to which an item belongs
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGroupsTheItemIsAMemberOfWithResponseSpec(String itemId) throws RestClientResponseException {
        return getGroupsTheItemIsAMemberOfRequestCreation(itemId);
    }
    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getItemLockRequestCreation(String itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getItemLock", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

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
        return apiClient.invokeAPI("/items/{itemId}/lock", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getItemLock(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getItemLockRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getItemLockWithHttpInfo(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemLockRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getItemLockWithResponseSpec(String itemId) throws RestClientResponseException {
        return getItemLockRequestCreation(itemId);
    }
    /**
     * Returns information about the rights to an item for the current user
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return ItemRights
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getItemRightsRequestCreation(String itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getItemRights", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

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

        ParameterizedTypeReference<ItemRights> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/items/{itemId}/rights", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns information about the rights to an item for the current user
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return ItemRights
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ItemRights getItemRights(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<ItemRights> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemRightsRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Returns information about the rights to an item for the current user
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;ItemRights&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ItemRights> getItemRightsWithHttpInfo(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<ItemRights> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemRightsRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Returns information about the rights to an item for the current user
     * 
     * <p><b>200</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getItemRightsWithResponseSpec(String itemId) throws RestClientResponseException {
        return getItemRightsRequestCreation(itemId);
    }
    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putItemLockRequestCreation(String itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling putItemLock", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

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
        return apiClient.invokeAPI("/items/{itemId}/lock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void putItemLock(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        putItemLockRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putItemLockWithHttpInfo(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return putItemLockRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putItemLockWithResponseSpec(String itemId) throws RestClientResponseException {
        return putItemLockRequestCreation(itemId);
    }
    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeItemLockRequestCreation(String itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling removeItemLock", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

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
        return apiClient.invokeAPI("/items/{itemId}/lock", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void removeItemLock(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        removeItemLockRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeItemLockWithHttpInfo(String itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return removeItemLockRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>0</b> - successful operation
     * @param itemId The itemId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeItemLockWithResponseSpec(String itemId) throws RestClientResponseException {
        return removeItemLockRequestCreation(itemId);
    }
    /**
     * Transfers an item to the specified group (either from the private space or another group)
     * 
     * <p><b>403</b> - Current user has no access
     * @param itemId The itemId parameter
     * @param groupId The groupId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transferItemOwnershipToGroupRequestCreation(String itemId, Long groupId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling transferItemOwnershipToGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/items/{itemId}/transferownership", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Transfers an item to the specified group (either from the private space or another group)
     * 
     * <p><b>403</b> - Current user has no access
     * @param itemId The itemId parameter
     * @param groupId The groupId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void transferItemOwnershipToGroup(String itemId, Long groupId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        transferItemOwnershipToGroupRequestCreation(itemId, groupId).body(localVarReturnType);
    }

    /**
     * Transfers an item to the specified group (either from the private space or another group)
     * 
     * <p><b>403</b> - Current user has no access
     * @param itemId The itemId parameter
     * @param groupId The groupId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transferItemOwnershipToGroupWithHttpInfo(String itemId, Long groupId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return transferItemOwnershipToGroupRequestCreation(itemId, groupId).toEntity(localVarReturnType);
    }

    /**
     * Transfers an item to the specified group (either from the private space or another group)
     * 
     * <p><b>403</b> - Current user has no access
     * @param itemId The itemId parameter
     * @param groupId The groupId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec transferItemOwnershipToGroupWithResponseSpec(String itemId, Long groupId) throws RestClientResponseException {
        return transferItemOwnershipToGroupRequestCreation(itemId, groupId);
    }
}
