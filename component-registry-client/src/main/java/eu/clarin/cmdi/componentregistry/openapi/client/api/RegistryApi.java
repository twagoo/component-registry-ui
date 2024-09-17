package eu.clarin.cmdi.componentregistry.openapi.client.api;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;

import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.Comment;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import java.io.File;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ProfileDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ProfileDescriptionsObject;
import eu.clarin.cmdi.componentregistry.openapi.client.model.Rss;

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
public class RegistryApi {
    private ApiClient apiClient;

    public RegistryApi() {
        this(new ApiClient());
    }

    @Autowired
    public RegistryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCommentFromComponentRequestCreation(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling deleteCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling deleteCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("commentId", commentId);

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
        return apiClient.invokeAPI("/registry/components/{componentId}/comments/{commentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteCommentFromComponent(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteCommentFromComponentRequestCreation(cmdVersion, componentId, commentId).body(localVarReturnType);
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommentFromComponentWithHttpInfo(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteCommentFromComponentRequestCreation(cmdVersion, componentId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCommentFromComponentWithResponseSpec(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        return deleteCommentFromComponentRequestCreation(cmdVersion, componentId, commentId);
    }
    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCommentFromComponent1RequestCreation(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling deleteCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling deleteCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("commentId", commentId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/comments/{commentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteCommentFromComponent1(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId).body(localVarReturnType);
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommentFromComponent1WithHttpInfo(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Deletes a comment from a component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCommentFromComponent1WithResponseSpec(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        return deleteCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId);
    }
    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCommentFromProfileRequestCreation(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling deleteCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling deleteCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("commentId", commentId);

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
        return apiClient.invokeAPI("/registry/profiles/{profileId}/comments/{commentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteCommentFromProfile(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteCommentFromProfileRequestCreation(cmdVersion, profileId, commentId).body(localVarReturnType);
    }

    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommentFromProfileWithHttpInfo(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteCommentFromProfileRequestCreation(cmdVersion, profileId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCommentFromProfileWithResponseSpec(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        return deleteCommentFromProfileRequestCreation(cmdVersion, profileId, commentId);
    }
    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteCommentFromProfile1RequestCreation(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling deleteCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling deleteCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("commentId", commentId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/comments/{commentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteCommentFromProfile1(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId).body(localVarReturnType);
    }

    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommentFromProfile1WithHttpInfo(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Deletes a comment from a profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Comment is not owned by current user and user is no administrator
     * <p><b>404</b> - Comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteCommentFromProfile1WithResponseSpec(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        return deleteCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId);
    }
    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRegisteredComponentRequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling deleteRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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
        return apiClient.invokeAPI("/registry/components/{componentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRegisteredComponent(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRegisteredComponentRequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRegisteredComponentWithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRegisteredComponentRequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRegisteredComponentWithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return deleteRegisteredComponentRequestCreation(cmdVersion, componentId);
    }
    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRegisteredComponent1RequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling deleteRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRegisteredComponent1(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRegisteredComponent1RequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRegisteredComponent1WithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRegisteredComponent1RequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Deletes the component with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRegisteredComponent1WithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return deleteRegisteredComponent1RequestCreation(cmdVersion, componentId);
    }
    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRegisteredProfileRequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling deleteRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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
        return apiClient.invokeAPI("/registry/profiles/{profileId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRegisteredProfile(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRegisteredProfileRequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRegisteredProfileWithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRegisteredProfileRequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRegisteredProfileWithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return deleteRegisteredProfileRequestCreation(cmdVersion, profileId);
    }
    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRegisteredProfile1RequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling deleteRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling deleteRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRegisteredProfile1(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRegisteredProfile1RequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRegisteredProfile1WithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRegisteredProfile1RequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Deletes the profile with the specified ID from its registry
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRegisteredProfile1WithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return deleteRegisteredProfile1RequestCreation(cmdVersion, profileId);
    }
    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCommentsFromComponentRequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getCommentsFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getCommentsFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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

        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/comments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Comment> getCommentsFromComponent(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromComponentRequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Comment>> getCommentsFromComponentWithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromComponentRequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCommentsFromComponentWithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getCommentsFromComponentRequestCreation(cmdVersion, componentId);
    }
    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCommentsFromComponent1RequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getCommentsFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getCommentsFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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

        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/comments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Comment> getCommentsFromComponent1(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromComponent1RequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Comment>> getCommentsFromComponent1WithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromComponent1RequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCommentsFromComponent1WithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getCommentsFromComponent1RequestCreation(cmdVersion, componentId);
    }
    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCommentsFromProfileRequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getCommentsFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getCommentsFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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

        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/comments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Comment> getCommentsFromProfile(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromProfileRequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Comment>> getCommentsFromProfileWithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromProfileRequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCommentsFromProfileWithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getCommentsFromProfileRequestCreation(cmdVersion, profileId);
    }
    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCommentsFromProfile1RequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getCommentsFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getCommentsFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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

        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/comments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return List&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Comment> getCommentsFromProfile1(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromProfile1RequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Comment>> getCommentsFromProfile1WithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<List<Comment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getCommentsFromProfile1RequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Returns a listing of all comments that have been made on the identified profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user and user is no administrator
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCommentsFromProfile1WithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getCommentsFromProfile1RequestCreation(cmdVersion, profileId);
    }
    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentStatusRequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getComponentStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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
        return apiClient.invokeAPI("/registry/components/{componentId}/status", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getComponentStatus(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getComponentStatusRequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getComponentStatusWithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentStatusRequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentStatusWithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getComponentStatusRequestCreation(cmdVersion, componentId);
    }
    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentStatus1RequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getComponentStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/status", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getComponentStatus1(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getComponentStatus1RequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getComponentStatus1WithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentStatus1RequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Gets the status of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentStatus1WithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getComponentStatus1RequestCreation(cmdVersion, componentId);
    }
    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentSuccessorRequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getComponentSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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
        return apiClient.invokeAPI("/registry/components/{componentId}/successor", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getComponentSuccessor(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getComponentSuccessorRequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getComponentSuccessorWithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentSuccessorRequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentSuccessorWithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getComponentSuccessorRequestCreation(cmdVersion, componentId);
    }
    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentSuccessor1RequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getComponentSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/successor", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getComponentSuccessor1(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getComponentSuccessor1RequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getComponentSuccessor1WithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentSuccessor1RequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentSuccessor1WithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getComponentSuccessor1RequestCreation(cmdVersion, componentId);
    }
    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentUsageRequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getComponentUsage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentUsage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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

        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/usage/{componentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<BaseDescription> getComponentUsage(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentUsageRequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;List&lt;BaseDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BaseDescription>> getComponentUsageWithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentUsageRequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentUsageWithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getComponentUsageRequestCreation(cmdVersion, componentId);
    }
    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComponentUsage1RequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getComponentUsage1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getComponentUsage1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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

        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/usage/{componentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return List&lt;BaseDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<BaseDescription> getComponentUsage1(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentUsage1RequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;List&lt;BaseDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BaseDescription>> getComponentUsage1WithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<List<BaseDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getComponentUsage1RequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a descriptions listing of components that use the identified component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComponentUsage1WithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getComponentUsage1RequestCreation(cmdVersion, componentId);
    }
    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProfileStatusRequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getProfileStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getProfileStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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
        return apiClient.invokeAPI("/registry/profiles/{profileId}/status", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getProfileStatus(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getProfileStatusRequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getProfileStatusWithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfileStatusRequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProfileStatusWithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getProfileStatusRequestCreation(cmdVersion, profileId);
    }
    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProfileStatus1RequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getProfileStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getProfileStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/status", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getProfileStatus1(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getProfileStatus1RequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getProfileStatus1WithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfileStatus1RequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Gets the status of a registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProfileStatus1WithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getProfileStatus1RequestCreation(cmdVersion, profileId);
    }
    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProfileSuccessorRequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getProfileSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getProfileSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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
        return apiClient.invokeAPI("/registry/profiles/{profileId}/successor", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getProfileSuccessor(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getProfileSuccessorRequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getProfileSuccessorWithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfileSuccessorRequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProfileSuccessorWithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getProfileSuccessorRequestCreation(cmdVersion, profileId);
    }
    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProfileSuccessor1RequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getProfileSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getProfileSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/successor", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getProfileSuccessor1(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getProfileSuccessor1RequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getProfileSuccessor1WithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProfileSuccessor1RequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * Gets the successor of a registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist (no item or no successor)
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProfileSuccessor1WithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getProfileSuccessor1RequestCreation(cmdVersion, profileId);
    }
    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredComponentRequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getRegisteredComponent(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentRequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getRegisteredComponentWithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentRequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredComponentWithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getRegisteredComponentRequestCreation(cmdVersion, componentId);
    }
    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredComponent1RequestCreation(String cmdVersion, String componentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

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

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getRegisteredComponent1(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponent1RequestCreation(cmdVersion, componentId).body(localVarReturnType);
    }

    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getRegisteredComponent1WithHttpInfo(String cmdVersion, String componentId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponent1RequestCreation(cmdVersion, componentId).toEntity(localVarReturnType);
    }

    /**
     * The component specification of a single component
     * 
     * <p><b>200</b> - The component specification for the identified component
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredComponent1WithResponseSpec(String cmdVersion, String componentId) throws RestClientResponseException {
        return getRegisteredComponent1RequestCreation(cmdVersion, componentId);
    }
    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredComponentRawTypeRequestCreation(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredComponentRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getRegisteredComponentRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'rawType' is set
        if (rawType == null) {
            throw new RestClientResponseException("Missing the required parameter 'rawType' when calling getRegisteredComponentRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("rawType", rawType);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "text/xml", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/{rawType}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getRegisteredComponentRawType(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentRawTypeRequestCreation(cmdVersion, componentId, rawType).body(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getRegisteredComponentRawTypeWithHttpInfo(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentRawTypeRequestCreation(cmdVersion, componentId, rawType).toEntity(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredComponentRawTypeWithResponseSpec(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        return getRegisteredComponentRawTypeRequestCreation(cmdVersion, componentId, rawType);
    }
    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredComponentRawType1RequestCreation(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredComponentRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getRegisteredComponentRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'rawType' is set
        if (rawType == null) {
            throw new RestClientResponseException("Missing the required parameter 'rawType' when calling getRegisteredComponentRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("rawType", rawType);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "text/xml", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/{rawType}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getRegisteredComponentRawType1(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentRawType1RequestCreation(cmdVersion, componentId, rawType).body(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getRegisteredComponentRawType1WithHttpInfo(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentRawType1RequestCreation(cmdVersion, componentId, rawType).toEntity(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param rawType The rawType parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredComponentRawType1WithResponseSpec(String cmdVersion, String componentId, String rawType) throws RestClientResponseException {
        return getRegisteredComponentRawType1RequestCreation(cmdVersion, componentId, rawType);
    }
    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ComponentDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredComponentsRequestCreation(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredComponents", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userspace", userspace));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ComponentDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ComponentDescription> getRegisteredComponents(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ComponentDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentsRequestCreation(cmdVersion, registrySpace, groupId, status, userspace).body(localVarReturnType);
    }

    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseEntity&lt;List&lt;ComponentDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentDescription>> getRegisteredComponentsWithHttpInfo(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ComponentDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponentsRequestCreation(cmdVersion, registrySpace, groupId, status, userspace).toEntity(localVarReturnType);
    }

    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredComponentsWithResponseSpec(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        return getRegisteredComponentsRequestCreation(cmdVersion, registrySpace, groupId, status, userspace);
    }
    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ComponentDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredComponents1RequestCreation(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredComponents1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userspace", userspace));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ComponentDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ComponentDescription> getRegisteredComponents1(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ComponentDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponents1RequestCreation(cmdVersion, registrySpace, groupId, status, userspace).body(localVarReturnType);
    }

    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseEntity&lt;List&lt;ComponentDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentDescription>> getRegisteredComponents1WithHttpInfo(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ComponentDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredComponents1RequestCreation(cmdVersion, registrySpace, groupId, status, userspace).toEntity(localVarReturnType);
    }

    /**
     * A listing of the descriptions of components in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredComponents1WithResponseSpec(String cmdVersion, String registrySpace, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        return getRegisteredComponents1RequestCreation(cmdVersion, registrySpace, groupId, status, userspace);
    }
    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfileRequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getRegisteredProfile(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfileRequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getRegisteredProfileWithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfileRequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfileWithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getRegisteredProfileRequestCreation(cmdVersion, profileId);
    }
    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfile1RequestCreation(String cmdVersion, String profileId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

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

        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ComponentSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ComponentSpec getRegisteredProfile1(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfile1RequestCreation(cmdVersion, profileId).body(localVarReturnType);
    }

    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseEntity&lt;ComponentSpec&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComponentSpec> getRegisteredProfile1WithHttpInfo(String cmdVersion, String profileId) throws RestClientResponseException {
        ParameterizedTypeReference<ComponentSpec> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfile1RequestCreation(cmdVersion, profileId).toEntity(localVarReturnType);
    }

    /**
     * The component specification of a single profile
     * 
     * <p><b>200</b> - The component specification for the identified profile
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfile1WithResponseSpec(String cmdVersion, String profileId) throws RestClientResponseException {
        return getRegisteredProfile1RequestCreation(cmdVersion, profileId);
    }
    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfileRawTypeRequestCreation(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfileRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getRegisteredProfileRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'targetVersion' is set
        if (targetVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'targetVersion' when calling getRegisteredProfileRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'rawType' is set
        if (rawType == null) {
            throw new RestClientResponseException("Missing the required parameter 'rawType' when calling getRegisteredProfileRawType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("targetVersion", targetVersion);
        pathParams.put("rawType", rawType);

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
        return apiClient.invokeAPI("/registry/profiles/{profileId}/{targetVersion}{rawType}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getRegisteredProfileRawType(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getRegisteredProfileRawTypeRequestCreation(cmdVersion, profileId, targetVersion, rawType).body(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getRegisteredProfileRawTypeWithHttpInfo(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfileRawTypeRequestCreation(cmdVersion, profileId, targetVersion, rawType).toEntity(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfileRawTypeWithResponseSpec(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        return getRegisteredProfileRawTypeRequestCreation(cmdVersion, profileId, targetVersion, rawType);
    }
    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfileRawType1RequestCreation(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfileRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getRegisteredProfileRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'targetVersion' is set
        if (targetVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'targetVersion' when calling getRegisteredProfileRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'rawType' is set
        if (rawType == null) {
            throw new RestClientResponseException("Missing the required parameter 'rawType' when calling getRegisteredProfileRawType1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("targetVersion", targetVersion);
        pathParams.put("rawType", rawType);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/{targetVersion}{rawType}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void getRegisteredProfileRawType1(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        getRegisteredProfileRawType1RequestCreation(cmdVersion, profileId, targetVersion, rawType).body(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getRegisteredProfileRawType1WithHttpInfo(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfileRawType1RequestCreation(cmdVersion, profileId, targetVersion, rawType).toEntity(localVarReturnType);
    }

    /**
     * The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)
     * 
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param targetVersion The targetVersion parameter
     * @param rawType The rawType parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfileRawType1WithResponseSpec(String cmdVersion, String profileId, String targetVersion, String rawType) throws RestClientResponseException {
        return getRegisteredProfileRawType1RequestCreation(cmdVersion, profileId, targetVersion, rawType);
    }
    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ProfileDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfilesRequestCreation(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfiles", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mdEditor", mdEditor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userspace", userspace));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ProfileDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ProfileDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ProfileDescription> getRegisteredProfiles(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProfileDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfilesRequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).body(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseEntity&lt;List&lt;ProfileDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProfileDescription>> getRegisteredProfilesWithHttpInfo(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProfileDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfilesRequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).toEntity(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfilesWithResponseSpec(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        return getRegisteredProfilesRequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
    }
    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ProfileDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfiles1RequestCreation(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfiles1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mdEditor", mdEditor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userspace", userspace));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ProfileDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return List&lt;ProfileDescription&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ProfileDescription> getRegisteredProfiles1(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProfileDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfiles1RequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).body(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseEntity&lt;List&lt;ProfileDescription&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProfileDescription>> getRegisteredProfiles1WithHttpInfo(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<List<ProfileDescription>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfiles1RequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).toEntity(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfiles1WithResponseSpec(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        return getRegisteredProfiles1RequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
    }
    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ProfileDescriptionsObject
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfilesObjectRequestCreation(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfilesObject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mdEditor", mdEditor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userspace", userspace));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProfileDescriptionsObject> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profilesList", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ProfileDescriptionsObject
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProfileDescriptionsObject getRegisteredProfilesObject(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<ProfileDescriptionsObject> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfilesObjectRequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).body(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseEntity&lt;ProfileDescriptionsObject&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProfileDescriptionsObject> getRegisteredProfilesObjectWithHttpInfo(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<ProfileDescriptionsObject> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfilesObjectRequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).toEntity(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfilesObjectWithResponseSpec(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        return getRegisteredProfilesObjectRequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
    }
    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ProfileDescriptionsObject
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRegisteredProfilesObject1RequestCreation(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRegisteredProfilesObject1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mdEditor", mdEditor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userspace", userspace));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProfileDescriptionsObject> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profilesList", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ProfileDescriptionsObject
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProfileDescriptionsObject getRegisteredProfilesObject1(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<ProfileDescriptionsObject> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfilesObject1RequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).body(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseEntity&lt;ProfileDescriptionsObject&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProfileDescriptionsObject> getRegisteredProfilesObject1WithHttpInfo(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        ParameterizedTypeReference<ProfileDescriptionsObject> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRegisteredProfilesObject1RequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace).toEntity(localVarReturnType);
    }

    /**
     * A listing of the descriptions of profiles in the specified registry space
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Registry requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public registry is not owned by current user
     * <p><b>404</b> - Registry space does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param registrySpace The registrySpace parameter
     * @param mdEditor The mdEditor parameter
     * @param groupId The groupId parameter
     * @param status The status parameter
     * @param userspace The userspace parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRegisteredProfilesObject1WithResponseSpec(String cmdVersion, String registrySpace, Boolean mdEditor, String groupId, List<String> status, String userspace) throws RestClientResponseException {
        return getRegisteredProfilesObject1RequestCreation(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssComponentRequestCreation(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssComponent(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssComponentRequestCreation(cmdVersion, groupId, registrySpace, status, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssComponentWithHttpInfo(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssComponentRequestCreation(cmdVersion, groupId, registrySpace, status, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssComponentWithResponseSpec(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        return getRssComponentRequestCreation(cmdVersion, groupId, registrySpace, status, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssComponent1RequestCreation(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssComponent1(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssComponent1RequestCreation(cmdVersion, groupId, registrySpace, status, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssComponent1WithHttpInfo(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssComponent1RequestCreation(cmdVersion, groupId, registrySpace, status, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssComponent1WithResponseSpec(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        return getRssComponent1RequestCreation(cmdVersion, groupId, registrySpace, status, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssOfCommentsFromComponentRequestCreation(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssOfCommentsFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getRssOfCommentsFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/comments/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssOfCommentsFromComponent(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromComponentRequestCreation(cmdVersion, componentId, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssOfCommentsFromComponentWithHttpInfo(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromComponentRequestCreation(cmdVersion, componentId, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssOfCommentsFromComponentWithResponseSpec(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        return getRssOfCommentsFromComponentRequestCreation(cmdVersion, componentId, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssOfCommentsFromComponent1RequestCreation(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssOfCommentsFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getRssOfCommentsFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/comments/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssOfCommentsFromComponent1(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromComponent1RequestCreation(cmdVersion, componentId, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssOfCommentsFromComponent1WithHttpInfo(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromComponent1RequestCreation(cmdVersion, componentId, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssOfCommentsFromComponent1WithResponseSpec(String cmdVersion, String componentId, String limit) throws RestClientResponseException {
        return getRssOfCommentsFromComponent1RequestCreation(cmdVersion, componentId, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssOfCommentsFromProfileRequestCreation(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssOfCommentsFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getRssOfCommentsFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/comments/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssOfCommentsFromProfile(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromProfileRequestCreation(cmdVersion, profileId, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssOfCommentsFromProfileWithHttpInfo(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromProfileRequestCreation(cmdVersion, profileId, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssOfCommentsFromProfileWithResponseSpec(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        return getRssOfCommentsFromProfileRequestCreation(cmdVersion, profileId, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssOfCommentsFromProfile1RequestCreation(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssOfCommentsFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getRssOfCommentsFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/comments/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssOfCommentsFromProfile1(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromProfile1RequestCreation(cmdVersion, profileId, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssOfCommentsFromProfile1WithHttpInfo(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssOfCommentsFromProfile1RequestCreation(cmdVersion, profileId, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssOfCommentsFromProfile1WithResponseSpec(String cmdVersion, String profileId, String limit) throws RestClientResponseException {
        return getRssOfCommentsFromProfile1RequestCreation(cmdVersion, profileId, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssProfileRequestCreation(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssProfile(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssProfileRequestCreation(cmdVersion, groupId, registrySpace, status, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssProfileWithHttpInfo(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssProfileRequestCreation(cmdVersion, groupId, registrySpace, status, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssProfileWithResponseSpec(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        return getRssProfileRequestCreation(cmdVersion, groupId, registrySpace, status, limit);
    }
    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRssProfile1RequestCreation(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getRssProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrySpace", registrySpace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        
        final String[] localVarAccepts = { 
            "text/xml", "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/rss", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return Rss
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Rss getRssProfile1(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssProfile1RequestCreation(cmdVersion, groupId, registrySpace, status, limit).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseEntity&lt;Rss&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Rss> getRssProfile1WithHttpInfo(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        ParameterizedTypeReference<Rss> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRssProfile1RequestCreation(cmdVersion, groupId, registrySpace, status, limit).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param groupId The groupId parameter
     * @param registrySpace The registrySpace parameter
     * @param status The status parameter
     * @param limit The limit parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRssProfile1WithResponseSpec(String cmdVersion, String groupId, String registrySpace, List<String> status, String limit) throws RestClientResponseException {
        return getRssProfile1RequestCreation(cmdVersion, groupId, registrySpace, status, limit);
    }
    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSpecifiedCommentFromComponentRequestCreation(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getSpecifiedCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getSpecifiedCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling getSpecifiedCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("commentId", commentId);

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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/comments/{commentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Comment getSpecifiedCommentFromComponent(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromComponentRequestCreation(cmdVersion, componentId, commentId).body(localVarReturnType);
    }

    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return ResponseEntity&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Comment> getSpecifiedCommentFromComponentWithHttpInfo(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromComponentRequestCreation(cmdVersion, componentId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSpecifiedCommentFromComponentWithResponseSpec(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        return getSpecifiedCommentFromComponentRequestCreation(cmdVersion, componentId, commentId);
    }
    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSpecifiedCommentFromComponent1RequestCreation(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getSpecifiedCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling getSpecifiedCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling getSpecifiedCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("commentId", commentId);

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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/comments/{commentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Comment getSpecifiedCommentFromComponent1(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId).body(localVarReturnType);
    }

    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return ResponseEntity&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Comment> getSpecifiedCommentFromComponent1WithHttpInfo(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a single comment on a component
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSpecifiedCommentFromComponent1WithResponseSpec(String cmdVersion, String componentId, String commentId) throws RestClientResponseException {
        return getSpecifiedCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId);
    }
    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSpecifiedCommentFromProfileRequestCreation(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getSpecifiedCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getSpecifiedCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling getSpecifiedCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("commentId", commentId);

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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/comments/{commentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Comment getSpecifiedCommentFromProfile(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromProfileRequestCreation(cmdVersion, profileId, commentId).body(localVarReturnType);
    }

    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return ResponseEntity&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Comment> getSpecifiedCommentFromProfileWithHttpInfo(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromProfileRequestCreation(cmdVersion, profileId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSpecifiedCommentFromProfileWithResponseSpec(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        return getSpecifiedCommentFromProfileRequestCreation(cmdVersion, profileId, commentId);
    }
    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSpecifiedCommentFromProfile1RequestCreation(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling getSpecifiedCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling getSpecifiedCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling getSpecifiedCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("commentId", commentId);

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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/comments/{commentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return Comment
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Comment getSpecifiedCommentFromProfile1(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId).body(localVarReturnType);
    }

    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return ResponseEntity&lt;Comment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Comment> getSpecifiedCommentFromProfile1WithHttpInfo(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSpecifiedCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Returns a single comment on a profile
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Component requires authorisation and user is not authenticated
     * <p><b>403</b> - Non-public component is not owned by current user
     * <p><b>404</b> - Component or comment does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSpecifiedCommentFromProfile1WithResponseSpec(String cmdVersion, String profileId, String commentId) throws RestClientResponseException {
        return getSpecifiedCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId);
    }
    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateCommentFromComponentRequestCreation(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling manipulateCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling manipulateCommentFromComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("commentId", commentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/comments/{commentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateCommentFromComponent(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateCommentFromComponentRequestCreation(cmdVersion, componentId, commentId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateCommentFromComponentWithHttpInfo(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateCommentFromComponentRequestCreation(cmdVersion, componentId, commentId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateCommentFromComponentWithResponseSpec(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        return manipulateCommentFromComponentRequestCreation(cmdVersion, componentId, commentId, method);
    }
    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateCommentFromComponent1RequestCreation(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling manipulateCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling manipulateCommentFromComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);
        pathParams.put("commentId", commentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/comments/{commentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateCommentFromComponent1(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateCommentFromComponent1WithHttpInfo(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateCommentFromComponent1WithResponseSpec(String cmdVersion, String componentId, String commentId, String method) throws RestClientResponseException {
        return manipulateCommentFromComponent1RequestCreation(cmdVersion, componentId, commentId, method);
    }
    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateCommentFromProfileRequestCreation(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling manipulateCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling manipulateCommentFromProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("commentId", commentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/comments/{commentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateCommentFromProfile(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateCommentFromProfileRequestCreation(cmdVersion, profileId, commentId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateCommentFromProfileWithHttpInfo(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateCommentFromProfileRequestCreation(cmdVersion, profileId, commentId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateCommentFromProfileWithResponseSpec(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        return manipulateCommentFromProfileRequestCreation(cmdVersion, profileId, commentId, method);
    }
    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateCommentFromProfile1RequestCreation(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling manipulateCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling manipulateCommentFromProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);
        pathParams.put("commentId", commentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/comments/{commentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateCommentFromProfile1(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateCommentFromProfile1WithHttpInfo(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param commentId The commentId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateCommentFromProfile1WithResponseSpec(String cmdVersion, String profileId, String commentId, String method) throws RestClientResponseException {
        return manipulateCommentFromProfile1RequestCreation(cmdVersion, profileId, commentId, method);
    }
    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateRegisteredComponentRequestCreation(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling manipulateRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateRegisteredComponent(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateRegisteredComponentRequestCreation(cmdVersion, componentId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateRegisteredComponentWithHttpInfo(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateRegisteredComponentRequestCreation(cmdVersion, componentId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateRegisteredComponentWithResponseSpec(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        return manipulateRegisteredComponentRequestCreation(cmdVersion, componentId, method);
    }
    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateRegisteredComponent1RequestCreation(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling manipulateRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateRegisteredComponent1(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateRegisteredComponent1RequestCreation(cmdVersion, componentId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateRegisteredComponent1WithHttpInfo(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateRegisteredComponent1RequestCreation(cmdVersion, componentId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single component (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateRegisteredComponent1WithResponseSpec(String cmdVersion, String componentId, String method) throws RestClientResponseException {
        return manipulateRegisteredComponent1RequestCreation(cmdVersion, componentId, method);
    }
    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateRegisteredProfileRequestCreation(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling manipulateRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateRegisteredProfile(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateRegisteredProfileRequestCreation(cmdVersion, profileId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateRegisteredProfileWithHttpInfo(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateRegisteredProfileRequestCreation(cmdVersion, profileId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateRegisteredProfileWithResponseSpec(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        return manipulateRegisteredProfileRequestCreation(cmdVersion, profileId, method);
    }
    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec manipulateRegisteredProfile1RequestCreation(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling manipulateRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling manipulateRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (method != null)
            formParams.add("method", method);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void manipulateRegisteredProfile1(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        manipulateRegisteredProfile1RequestCreation(cmdVersion, profileId, method).body(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> manipulateRegisteredProfile1WithHttpInfo(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return manipulateRegisteredProfile1RequestCreation(cmdVersion, profileId, method).toEntity(localVarReturnType);
    }

    /**
     * Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param method The method parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec manipulateRegisteredProfile1WithResponseSpec(String cmdVersion, String profileId, String method) throws RestClientResponseException {
        return manipulateRegisteredProfile1RequestCreation(cmdVersion, profileId, method);
    }
    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pingSessionRequestCreation(String cmdVersion) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling pingSession", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

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
        return apiClient.invokeAPI("/registry/pingSession", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void pingSession(String cmdVersion) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        pingSessionRequestCreation(cmdVersion).body(localVarReturnType);
    }

    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pingSessionWithHttpInfo(String cmdVersion) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingSessionRequestCreation(cmdVersion).toEntity(localVarReturnType);
    }

    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pingSessionWithResponseSpec(String cmdVersion) throws RestClientResponseException {
        return pingSessionRequestCreation(cmdVersion);
    }
    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec pingSession1RequestCreation(String cmdVersion) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling pingSession1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

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
        return apiClient.invokeAPI("/registry/{cmdVersion}/pingSession", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void pingSession1(String cmdVersion) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        pingSession1RequestCreation(cmdVersion).body(localVarReturnType);
    }

    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pingSession1WithHttpInfo(String cmdVersion) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return pingSession1RequestCreation(cmdVersion).toEntity(localVarReturnType);
    }

    /**
     * Keeps the session alive
     * 
     * <p><b>0</b> - successful operation
     * @param cmdVersion The cmdVersion parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec pingSession1WithResponseSpec(String cmdVersion) throws RestClientResponseException {
        return pingSession1RequestCreation(cmdVersion);
    }
    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec publishRegisteredComponentRequestCreation(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling publishRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling publishRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/publish", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void publishRegisteredComponent(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        publishRegisteredComponentRequestCreation(cmdVersion, componentId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> publishRegisteredComponentWithHttpInfo(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return publishRegisteredComponentRequestCreation(cmdVersion, componentId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec publishRegisteredComponentWithResponseSpec(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return publishRegisteredComponentRequestCreation(cmdVersion, componentId, data, name, description, group, domainName);
    }
    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec publishRegisteredComponent1RequestCreation(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling publishRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling publishRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/publish", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void publishRegisteredComponent1(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        publishRegisteredComponent1RequestCreation(cmdVersion, componentId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> publishRegisteredComponent1WithHttpInfo(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return publishRegisteredComponent1RequestCreation(cmdVersion, componentId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Changes the state of the specified component to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec publishRegisteredComponent1WithResponseSpec(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return publishRegisteredComponent1RequestCreation(cmdVersion, componentId, data, name, description, group, domainName);
    }
    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec publishRegisteredProfileRequestCreation(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling publishRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling publishRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/publish", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void publishRegisteredProfile(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        publishRegisteredProfileRequestCreation(cmdVersion, profileId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> publishRegisteredProfileWithHttpInfo(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return publishRegisteredProfileRequestCreation(cmdVersion, profileId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec publishRegisteredProfileWithResponseSpec(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return publishRegisteredProfileRequestCreation(cmdVersion, profileId, data, name, description, group, domainName);
    }
    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec publishRegisteredProfile1RequestCreation(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling publishRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling publishRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/publish", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void publishRegisteredProfile1(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        publishRegisteredProfile1RequestCreation(cmdVersion, profileId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> publishRegisteredProfile1WithHttpInfo(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return publishRegisteredProfile1RequestCreation(cmdVersion, profileId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Changes the state of the specified profile to published
     * 
     * <p><b>401</b> - Item requires authorisation and user is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec publishRegisteredProfile1WithResponseSpec(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return publishRegisteredProfile1RequestCreation(cmdVersion, profileId, data, name, description, group, domainName);
    }
    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerCommentInComponentRequestCreation(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerCommentInComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling registerCommentInComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/comments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerCommentInComponent(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerCommentInComponentRequestCreation(cmdVersion, componentId, data).body(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerCommentInComponentWithHttpInfo(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerCommentInComponentRequestCreation(cmdVersion, componentId, data).toEntity(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerCommentInComponentWithResponseSpec(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        return registerCommentInComponentRequestCreation(cmdVersion, componentId, data);
    }
    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerCommentInComponent1RequestCreation(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerCommentInComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling registerCommentInComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/comments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerCommentInComponent1(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerCommentInComponent1RequestCreation(cmdVersion, componentId, data).body(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerCommentInComponent1WithHttpInfo(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerCommentInComponent1RequestCreation(cmdVersion, componentId, data).toEntity(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerCommentInComponent1WithResponseSpec(String cmdVersion, String componentId, File data) throws RestClientResponseException {
        return registerCommentInComponent1RequestCreation(cmdVersion, componentId, data);
    }
    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerCommentInProfileRequestCreation(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerCommentInProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling registerCommentInProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/comments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerCommentInProfile(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerCommentInProfileRequestCreation(cmdVersion, profileId, data).body(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerCommentInProfileWithHttpInfo(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerCommentInProfileRequestCreation(cmdVersion, profileId, data).toEntity(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerCommentInProfileWithResponseSpec(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        return registerCommentInProfileRequestCreation(cmdVersion, profileId, data);
    }
    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerCommentInProfile1RequestCreation(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerCommentInProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling registerCommentInProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/comments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerCommentInProfile1(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerCommentInProfile1RequestCreation(cmdVersion, profileId, data).body(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerCommentInProfile1WithHttpInfo(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerCommentInProfile1RequestCreation(cmdVersion, profileId, data).toEntity(localVarReturnType);
    }

    /**
     * Publishes a comment on the specified profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Non-public item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerCommentInProfile1WithResponseSpec(String cmdVersion, String profileId, File data) throws RestClientResponseException {
        return registerCommentInProfile1RequestCreation(cmdVersion, profileId, data);
    }
    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerComponentRequestCreation(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerComponent(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerComponentRequestCreation(cmdVersion, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerComponentWithHttpInfo(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerComponentRequestCreation(cmdVersion, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerComponentWithResponseSpec(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return registerComponentRequestCreation(cmdVersion, data, name, description, group, domainName);
    }
    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerComponent1RequestCreation(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerComponent1(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerComponent1RequestCreation(cmdVersion, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerComponent1WithHttpInfo(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerComponent1RequestCreation(cmdVersion, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerComponent1WithResponseSpec(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return registerComponent1RequestCreation(cmdVersion, data, name, description, group, domainName);
    }
    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerProfileRequestCreation(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerProfile(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerProfileRequestCreation(cmdVersion, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerProfileWithHttpInfo(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerProfileRequestCreation(cmdVersion, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerProfileWithResponseSpec(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return registerProfileRequestCreation(cmdVersion, data, name, description, group, domainName);
    }
    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerProfile1RequestCreation(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling registerProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void registerProfile1(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        registerProfile1RequestCreation(cmdVersion, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registerProfile1WithHttpInfo(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return registerProfile1RequestCreation(cmdVersion, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Current user has no access
     * @param cmdVersion The cmdVersion parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerProfile1WithResponseSpec(String cmdVersion, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return registerProfile1RequestCreation(cmdVersion, data, name, description, group, domainName);
    }
    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateComponentStatusRequestCreation(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateComponentStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling updateComponentStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (status != null)
            formParams.add("status", status);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/status", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateComponentStatus(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateComponentStatusRequestCreation(cmdVersion, componentId, status).body(localVarReturnType);
    }

    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateComponentStatusWithHttpInfo(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateComponentStatusRequestCreation(cmdVersion, componentId, status).toEntity(localVarReturnType);
    }

    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateComponentStatusWithResponseSpec(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        return updateComponentStatusRequestCreation(cmdVersion, componentId, status);
    }
    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateComponentStatus1RequestCreation(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateComponentStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling updateComponentStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (status != null)
            formParams.add("status", status);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/status", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateComponentStatus1(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateComponentStatus1RequestCreation(cmdVersion, componentId, status).body(localVarReturnType);
    }

    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateComponentStatus1WithHttpInfo(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateComponentStatus1RequestCreation(cmdVersion, componentId, status).toEntity(localVarReturnType);
    }

    /**
     * Updates the status of an already registered component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param status The status parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateComponentStatus1WithResponseSpec(String cmdVersion, String componentId, String status) throws RestClientResponseException {
        return updateComponentStatus1RequestCreation(cmdVersion, componentId, status);
    }
    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateComponentSuccessorRequestCreation(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateComponentSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling updateComponentSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (successor != null)
            formParams.add("successor", successor);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/successor", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateComponentSuccessor(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateComponentSuccessorRequestCreation(cmdVersion, componentId, successor).body(localVarReturnType);
    }

    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateComponentSuccessorWithHttpInfo(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateComponentSuccessorRequestCreation(cmdVersion, componentId, successor).toEntity(localVarReturnType);
    }

    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateComponentSuccessorWithResponseSpec(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        return updateComponentSuccessorRequestCreation(cmdVersion, componentId, successor);
    }
    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateComponentSuccessor1RequestCreation(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateComponentSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling updateComponentSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (successor != null)
            formParams.add("successor", successor);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/successor", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateComponentSuccessor1(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateComponentSuccessor1RequestCreation(cmdVersion, componentId, successor).body(localVarReturnType);
    }

    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateComponentSuccessor1WithHttpInfo(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateComponentSuccessor1RequestCreation(cmdVersion, componentId, successor).toEntity(localVarReturnType);
    }

    /**
     * Sets the successor for a registered component (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param successor The successor parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateComponentSuccessor1WithResponseSpec(String cmdVersion, String componentId, String successor) throws RestClientResponseException {
        return updateComponentSuccessor1RequestCreation(cmdVersion, componentId, successor);
    }
    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProfileStatusRequestCreation(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateProfileStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling updateProfileStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (status != null)
            formParams.add("status", status);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/status", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProfileStatus(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProfileStatusRequestCreation(cmdVersion, profileId, status).body(localVarReturnType);
    }

    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProfileStatusWithHttpInfo(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProfileStatusRequestCreation(cmdVersion, profileId, status).toEntity(localVarReturnType);
    }

    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProfileStatusWithResponseSpec(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        return updateProfileStatusRequestCreation(cmdVersion, profileId, status);
    }
    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProfileStatus1RequestCreation(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateProfileStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling updateProfileStatus1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (status != null)
            formParams.add("status", status);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/status", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProfileStatus1(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProfileStatus1RequestCreation(cmdVersion, profileId, status).body(localVarReturnType);
    }

    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProfileStatus1WithHttpInfo(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProfileStatus1RequestCreation(cmdVersion, profileId, status).toEntity(localVarReturnType);
    }

    /**
     * Updates the status of an already registered profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param status The status parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProfileStatus1WithResponseSpec(String cmdVersion, String profileId, String status) throws RestClientResponseException {
        return updateProfileStatus1RequestCreation(cmdVersion, profileId, status);
    }
    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProfileSuccessorRequestCreation(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateProfileSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling updateProfileSuccessor", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (successor != null)
            formParams.add("successor", successor);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/successor", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProfileSuccessor(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProfileSuccessorRequestCreation(cmdVersion, profileId, successor).body(localVarReturnType);
    }

    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProfileSuccessorWithHttpInfo(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProfileSuccessorRequestCreation(cmdVersion, profileId, successor).toEntity(localVarReturnType);
    }

    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProfileSuccessorWithResponseSpec(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        return updateProfileSuccessorRequestCreation(cmdVersion, profileId, successor);
    }
    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateProfileSuccessor1RequestCreation(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateProfileSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling updateProfileSuccessor1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (successor != null)
            formParams.add("successor", successor);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/successor", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateProfileSuccessor1(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateProfileSuccessor1RequestCreation(cmdVersion, profileId, successor).body(localVarReturnType);
    }

    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateProfileSuccessor1WithHttpInfo(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateProfileSuccessor1RequestCreation(cmdVersion, profileId, successor).toEntity(localVarReturnType);
    }

    /**
     * Sets the successor for a registered profile (must have deprecated status)
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param successor The successor parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateProfileSuccessor1WithResponseSpec(String cmdVersion, String profileId, String successor) throws RestClientResponseException {
        return updateProfileSuccessor1RequestCreation(cmdVersion, profileId, successor);
    }
    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRegisteredComponentRequestCreation(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling updateRegisteredComponent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/components/{componentId}/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRegisteredComponent(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRegisteredComponentRequestCreation(cmdVersion, componentId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRegisteredComponentWithHttpInfo(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRegisteredComponentRequestCreation(cmdVersion, componentId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRegisteredComponentWithResponseSpec(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return updateRegisteredComponentRequestCreation(cmdVersion, componentId, data, name, description, group, domainName);
    }
    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRegisteredComponent1RequestCreation(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'componentId' when calling updateRegisteredComponent1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("componentId", componentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/components/{componentId}/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRegisteredComponent1(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRegisteredComponent1RequestCreation(cmdVersion, componentId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRegisteredComponent1WithHttpInfo(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRegisteredComponent1RequestCreation(cmdVersion, componentId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) component
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param componentId The componentId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRegisteredComponent1WithResponseSpec(String cmdVersion, String componentId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return updateRegisteredComponent1RequestCreation(cmdVersion, componentId, data, name, description, group, domainName);
    }
    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRegisteredProfileRequestCreation(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling updateRegisteredProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/profiles/{profileId}/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRegisteredProfile(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRegisteredProfileRequestCreation(cmdVersion, profileId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRegisteredProfileWithHttpInfo(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRegisteredProfileRequestCreation(cmdVersion, profileId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRegisteredProfileWithResponseSpec(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return updateRegisteredProfileRequestCreation(cmdVersion, profileId, data, name, description, group, domainName);
    }
    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRegisteredProfile1RequestCreation(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'cmdVersion' is set
        if (cmdVersion == null) {
            throw new RestClientResponseException("Missing the required parameter 'cmdVersion' when calling updateRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new RestClientResponseException("Missing the required parameter 'profileId' when calling updateRegisteredProfile1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("cmdVersion", cmdVersion);
        pathParams.put("profileId", profileId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (data != null)
            formParams.add("data", new FileSystemResource(data));
        if (name != null)
            formParams.add("name", name);
        if (description != null)
            formParams.add("description", description);
        if (group != null)
            formParams.add("group", group);
        if (domainName != null)
            formParams.add("domainName", domainName);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/registry/{cmdVersion}/profiles/{profileId}/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRegisteredProfile1(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRegisteredProfile1RequestCreation(cmdVersion, profileId, data, name, description, group, domainName).body(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRegisteredProfile1WithHttpInfo(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRegisteredProfile1RequestCreation(cmdVersion, profileId, data, name, description, group, domainName).toEntity(localVarReturnType);
    }

    /**
     * Updates an already registered (but unpublished) profile
     * 
     * <p><b>401</b> - User is not authenticated
     * <p><b>403</b> - Item is not owned by current user
     * <p><b>404</b> - Item does not exist
     * @param cmdVersion The cmdVersion parameter
     * @param profileId The profileId parameter
     * @param data The data parameter
     * @param name The name parameter
     * @param description The description parameter
     * @param group The group parameter
     * @param domainName The domainName parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRegisteredProfile1WithResponseSpec(String cmdVersion, String profileId, File data, String name, String description, String group, String domainName) throws RestClientResponseException {
        return updateRegisteredProfile1RequestCreation(cmdVersion, profileId, data, name, description, group, domainName);
    }
}
