# RegistryApi

All URIs are relative to *https://catalog.clarin.eu/ds/ComponentRegistry/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCommentFromComponent**](RegistryApi.md#deleteCommentFromComponent) | **DELETE** /registry/components/{componentId}/comments/{commentId} | Deletes a comment from a component |
| [**deleteCommentFromComponent1**](RegistryApi.md#deleteCommentFromComponent1) | **DELETE** /registry/{cmdVersion}/components/{componentId}/comments/{commentId} | Deletes a comment from a component |
| [**deleteCommentFromProfile**](RegistryApi.md#deleteCommentFromProfile) | **DELETE** /registry/profiles/{profileId}/comments/{commentId} | Deletes a comment from a profile |
| [**deleteCommentFromProfile1**](RegistryApi.md#deleteCommentFromProfile1) | **DELETE** /registry/{cmdVersion}/profiles/{profileId}/comments/{commentId} | Deletes a comment from a profile |
| [**deleteRegisteredComponent**](RegistryApi.md#deleteRegisteredComponent) | **DELETE** /registry/components/{componentId} | Deletes the component with the specified ID from its registry |
| [**deleteRegisteredComponent1**](RegistryApi.md#deleteRegisteredComponent1) | **DELETE** /registry/{cmdVersion}/components/{componentId} | Deletes the component with the specified ID from its registry |
| [**deleteRegisteredProfile**](RegistryApi.md#deleteRegisteredProfile) | **DELETE** /registry/profiles/{profileId} | Deletes the profile with the specified ID from its registry |
| [**deleteRegisteredProfile1**](RegistryApi.md#deleteRegisteredProfile1) | **DELETE** /registry/{cmdVersion}/profiles/{profileId} | Deletes the profile with the specified ID from its registry |
| [**getCommentsFromComponent**](RegistryApi.md#getCommentsFromComponent) | **GET** /registry/components/{componentId}/comments | Returns a listing of all comments that have been made on the identified component |
| [**getCommentsFromComponent1**](RegistryApi.md#getCommentsFromComponent1) | **GET** /registry/{cmdVersion}/components/{componentId}/comments | Returns a listing of all comments that have been made on the identified component |
| [**getCommentsFromProfile**](RegistryApi.md#getCommentsFromProfile) | **GET** /registry/profiles/{profileId}/comments | Returns a listing of all comments that have been made on the identified profile |
| [**getCommentsFromProfile1**](RegistryApi.md#getCommentsFromProfile1) | **GET** /registry/{cmdVersion}/profiles/{profileId}/comments | Returns a listing of all comments that have been made on the identified profile |
| [**getComponentStatus**](RegistryApi.md#getComponentStatus) | **GET** /registry/components/{componentId}/status | Gets the status of a registered component |
| [**getComponentStatus1**](RegistryApi.md#getComponentStatus1) | **GET** /registry/{cmdVersion}/components/{componentId}/status | Gets the status of a registered component |
| [**getComponentSuccessor**](RegistryApi.md#getComponentSuccessor) | **GET** /registry/components/{componentId}/successor | Gets the successor of a registered component |
| [**getComponentSuccessor1**](RegistryApi.md#getComponentSuccessor1) | **GET** /registry/{cmdVersion}/components/{componentId}/successor | Gets the successor of a registered component |
| [**getComponentUsage**](RegistryApi.md#getComponentUsage) | **GET** /registry/components/usage/{componentId} | Returns a descriptions listing of components that use the identified component |
| [**getComponentUsage1**](RegistryApi.md#getComponentUsage1) | **GET** /registry/{cmdVersion}/components/usage/{componentId} | Returns a descriptions listing of components that use the identified component |
| [**getProfileStatus**](RegistryApi.md#getProfileStatus) | **GET** /registry/profiles/{profileId}/status | Gets the status of a registered profile |
| [**getProfileStatus1**](RegistryApi.md#getProfileStatus1) | **GET** /registry/{cmdVersion}/profiles/{profileId}/status | Gets the status of a registered profile |
| [**getProfileSuccessor**](RegistryApi.md#getProfileSuccessor) | **GET** /registry/profiles/{profileId}/successor | Gets the successor of a registered component |
| [**getProfileSuccessor1**](RegistryApi.md#getProfileSuccessor1) | **GET** /registry/{cmdVersion}/profiles/{profileId}/successor | Gets the successor of a registered component |
| [**getRegisteredComponent**](RegistryApi.md#getRegisteredComponent) | **GET** /registry/components/{componentId} | The component specification of a single component |
| [**getRegisteredComponent1**](RegistryApi.md#getRegisteredComponent1) | **GET** /registry/{cmdVersion}/components/{componentId} | The component specification of a single component |
| [**getRegisteredComponentRawType**](RegistryApi.md#getRegisteredComponentRawType) | **GET** /registry/components/{componentId}/{rawType} | The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!) |
| [**getRegisteredComponentRawType1**](RegistryApi.md#getRegisteredComponentRawType1) | **GET** /registry/{cmdVersion}/components/{componentId}/{rawType} | The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!) |
| [**getRegisteredComponents**](RegistryApi.md#getRegisteredComponents) | **GET** /registry/components | A listing of the descriptions of components in the specified registry space |
| [**getRegisteredComponents1**](RegistryApi.md#getRegisteredComponents1) | **GET** /registry/{cmdVersion}/components | A listing of the descriptions of components in the specified registry space |
| [**getRegisteredProfile**](RegistryApi.md#getRegisteredProfile) | **GET** /registry/profiles/{profileId} | The component specification of a single profile |
| [**getRegisteredProfile1**](RegistryApi.md#getRegisteredProfile1) | **GET** /registry/{cmdVersion}/profiles/{profileId} | The component specification of a single profile |
| [**getRegisteredProfileRawType**](RegistryApi.md#getRegisteredProfileRawType) | **GET** /registry/profiles/{profileId}/{targetVersion}{rawType} | The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!) |
| [**getRegisteredProfileRawType1**](RegistryApi.md#getRegisteredProfileRawType1) | **GET** /registry/{cmdVersion}/profiles/{profileId}/{targetVersion}{rawType} | The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!) |
| [**getRegisteredProfiles**](RegistryApi.md#getRegisteredProfiles) | **GET** /registry/profiles | A listing of the descriptions of profiles in the specified registry space |
| [**getRegisteredProfiles1**](RegistryApi.md#getRegisteredProfiles1) | **GET** /registry/{cmdVersion}/profiles | A listing of the descriptions of profiles in the specified registry space |
| [**getRegisteredProfilesObject**](RegistryApi.md#getRegisteredProfilesObject) | **GET** /registry/profilesList | A listing of the descriptions of profiles in the specified registry space |
| [**getRegisteredProfilesObject1**](RegistryApi.md#getRegisteredProfilesObject1) | **GET** /registry/{cmdVersion}/profilesList | A listing of the descriptions of profiles in the specified registry space |
| [**getRssComponent**](RegistryApi.md#getRssComponent) | **GET** /registry/components/rss |  |
| [**getRssComponent1**](RegistryApi.md#getRssComponent1) | **GET** /registry/{cmdVersion}/components/rss |  |
| [**getRssOfCommentsFromComponent**](RegistryApi.md#getRssOfCommentsFromComponent) | **GET** /registry/components/{componentId}/comments/rss |  |
| [**getRssOfCommentsFromComponent1**](RegistryApi.md#getRssOfCommentsFromComponent1) | **GET** /registry/{cmdVersion}/components/{componentId}/comments/rss |  |
| [**getRssOfCommentsFromProfile**](RegistryApi.md#getRssOfCommentsFromProfile) | **GET** /registry/profiles/{profileId}/comments/rss |  |
| [**getRssOfCommentsFromProfile1**](RegistryApi.md#getRssOfCommentsFromProfile1) | **GET** /registry/{cmdVersion}/profiles/{profileId}/comments/rss |  |
| [**getRssProfile**](RegistryApi.md#getRssProfile) | **GET** /registry/profiles/rss |  |
| [**getRssProfile1**](RegistryApi.md#getRssProfile1) | **GET** /registry/{cmdVersion}/profiles/rss |  |
| [**getSpecifiedCommentFromComponent**](RegistryApi.md#getSpecifiedCommentFromComponent) | **GET** /registry/components/{componentId}/comments/{commentId} | Returns a single comment on a component |
| [**getSpecifiedCommentFromComponent1**](RegistryApi.md#getSpecifiedCommentFromComponent1) | **GET** /registry/{cmdVersion}/components/{componentId}/comments/{commentId} | Returns a single comment on a component |
| [**getSpecifiedCommentFromProfile**](RegistryApi.md#getSpecifiedCommentFromProfile) | **GET** /registry/profiles/{profileId}/comments/{commentId} | Returns a single comment on a profile |
| [**getSpecifiedCommentFromProfile1**](RegistryApi.md#getSpecifiedCommentFromProfile1) | **GET** /registry/{cmdVersion}/profiles/{profileId}/comments/{commentId} | Returns a single comment on a profile |
| [**manipulateCommentFromComponent**](RegistryApi.md#manipulateCommentFromComponent) | **POST** /registry/components/{componentId}/comments/{commentId} | Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method) |
| [**manipulateCommentFromComponent1**](RegistryApi.md#manipulateCommentFromComponent1) | **POST** /registry/{cmdVersion}/components/{componentId}/comments/{commentId} | Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method) |
| [**manipulateCommentFromProfile**](RegistryApi.md#manipulateCommentFromProfile) | **POST** /registry/profiles/{profileId}/comments/{commentId} | Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method) |
| [**manipulateCommentFromProfile1**](RegistryApi.md#manipulateCommentFromProfile1) | **POST** /registry/{cmdVersion}/profiles/{profileId}/comments/{commentId} | Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method) |
| [**manipulateRegisteredComponent**](RegistryApi.md#manipulateRegisteredComponent) | **POST** /registry/components/{componentId} | Allows for deletion of single component (workaround for Flex which does not support the DELETE method) |
| [**manipulateRegisteredComponent1**](RegistryApi.md#manipulateRegisteredComponent1) | **POST** /registry/{cmdVersion}/components/{componentId} | Allows for deletion of single component (workaround for Flex which does not support the DELETE method) |
| [**manipulateRegisteredProfile**](RegistryApi.md#manipulateRegisteredProfile) | **POST** /registry/profiles/{profileId} | Allows for deletion of single profile (workaround for Flex which does not support the DELETE method) |
| [**manipulateRegisteredProfile1**](RegistryApi.md#manipulateRegisteredProfile1) | **POST** /registry/{cmdVersion}/profiles/{profileId} | Allows for deletion of single profile (workaround for Flex which does not support the DELETE method) |
| [**pingSession**](RegistryApi.md#pingSession) | **GET** /registry/pingSession | Keeps the session alive |
| [**pingSession1**](RegistryApi.md#pingSession1) | **GET** /registry/{cmdVersion}/pingSession | Keeps the session alive |
| [**publishRegisteredComponent**](RegistryApi.md#publishRegisteredComponent) | **POST** /registry/components/{componentId}/publish | Changes the state of the specified component to published |
| [**publishRegisteredComponent1**](RegistryApi.md#publishRegisteredComponent1) | **POST** /registry/{cmdVersion}/components/{componentId}/publish | Changes the state of the specified component to published |
| [**publishRegisteredProfile**](RegistryApi.md#publishRegisteredProfile) | **POST** /registry/profiles/{profileId}/publish | Changes the state of the specified profile to published |
| [**publishRegisteredProfile1**](RegistryApi.md#publishRegisteredProfile1) | **POST** /registry/{cmdVersion}/profiles/{profileId}/publish | Changes the state of the specified profile to published |
| [**registerCommentInComponent**](RegistryApi.md#registerCommentInComponent) | **POST** /registry/components/{componentId}/comments | Publishes a comment on the specified component |
| [**registerCommentInComponent1**](RegistryApi.md#registerCommentInComponent1) | **POST** /registry/{cmdVersion}/components/{componentId}/comments | Publishes a comment on the specified component |
| [**registerCommentInProfile**](RegistryApi.md#registerCommentInProfile) | **POST** /registry/profiles/{profileId}/comments | Publishes a comment on the specified profile |
| [**registerCommentInProfile1**](RegistryApi.md#registerCommentInProfile1) | **POST** /registry/{cmdVersion}/profiles/{profileId}/comments | Publishes a comment on the specified profile |
| [**registerComponent**](RegistryApi.md#registerComponent) | **POST** /registry/components | Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space |
| [**registerComponent1**](RegistryApi.md#registerComponent1) | **POST** /registry/{cmdVersion}/components | Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space |
| [**registerProfile**](RegistryApi.md#registerProfile) | **POST** /registry/profiles | Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space |
| [**registerProfile1**](RegistryApi.md#registerProfile1) | **POST** /registry/{cmdVersion}/profiles | Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space |
| [**updateComponentStatus**](RegistryApi.md#updateComponentStatus) | **POST** /registry/components/{componentId}/status | Updates the status of an already registered component |
| [**updateComponentStatus1**](RegistryApi.md#updateComponentStatus1) | **POST** /registry/{cmdVersion}/components/{componentId}/status | Updates the status of an already registered component |
| [**updateComponentSuccessor**](RegistryApi.md#updateComponentSuccessor) | **POST** /registry/components/{componentId}/successor | Sets the successor for a registered component (must have deprecated status) |
| [**updateComponentSuccessor1**](RegistryApi.md#updateComponentSuccessor1) | **POST** /registry/{cmdVersion}/components/{componentId}/successor | Sets the successor for a registered component (must have deprecated status) |
| [**updateProfileStatus**](RegistryApi.md#updateProfileStatus) | **POST** /registry/profiles/{profileId}/status | Updates the status of an already registered profile |
| [**updateProfileStatus1**](RegistryApi.md#updateProfileStatus1) | **POST** /registry/{cmdVersion}/profiles/{profileId}/status | Updates the status of an already registered profile |
| [**updateProfileSuccessor**](RegistryApi.md#updateProfileSuccessor) | **POST** /registry/profiles/{profileId}/successor | Sets the successor for a registered profile (must have deprecated status) |
| [**updateProfileSuccessor1**](RegistryApi.md#updateProfileSuccessor1) | **POST** /registry/{cmdVersion}/profiles/{profileId}/successor | Sets the successor for a registered profile (must have deprecated status) |
| [**updateRegisteredComponent**](RegistryApi.md#updateRegisteredComponent) | **POST** /registry/components/{componentId}/update | Updates an already registered (but unpublished) component |
| [**updateRegisteredComponent1**](RegistryApi.md#updateRegisteredComponent1) | **POST** /registry/{cmdVersion}/components/{componentId}/update | Updates an already registered (but unpublished) component |
| [**updateRegisteredProfile**](RegistryApi.md#updateRegisteredProfile) | **POST** /registry/profiles/{profileId}/update | Updates an already registered (but unpublished) profile |
| [**updateRegisteredProfile1**](RegistryApi.md#updateRegisteredProfile1) | **POST** /registry/{cmdVersion}/profiles/{profileId}/update | Updates an already registered (but unpublished) profile |



## deleteCommentFromComponent

> deleteCommentFromComponent(cmdVersion, componentId, commentId)

Deletes a comment from a component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            apiInstance.deleteCommentFromComponent(cmdVersion, componentId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteCommentFromComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Comment is not owned by current user and user is no administrator |  -  |
| **404** | Comment does not exist |  -  |


## deleteCommentFromComponent1

> deleteCommentFromComponent1(cmdVersion, componentId, commentId)

Deletes a comment from a component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            apiInstance.deleteCommentFromComponent1(cmdVersion, componentId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteCommentFromComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Comment is not owned by current user and user is no administrator |  -  |
| **404** | Comment does not exist |  -  |


## deleteCommentFromProfile

> deleteCommentFromProfile(cmdVersion, profileId, commentId)

Deletes a comment from a profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            apiInstance.deleteCommentFromProfile(cmdVersion, profileId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteCommentFromProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Comment is not owned by current user and user is no administrator |  -  |
| **404** | Comment does not exist |  -  |


## deleteCommentFromProfile1

> deleteCommentFromProfile1(cmdVersion, profileId, commentId)

Deletes a comment from a profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            apiInstance.deleteCommentFromProfile1(cmdVersion, profileId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteCommentFromProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Comment is not owned by current user and user is no administrator |  -  |
| **404** | Comment does not exist |  -  |


## deleteRegisteredComponent

> deleteRegisteredComponent(cmdVersion, componentId)

Deletes the component with the specified ID from its registry

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            apiInstance.deleteRegisteredComponent(cmdVersion, componentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteRegisteredComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## deleteRegisteredComponent1

> deleteRegisteredComponent1(cmdVersion, componentId)

Deletes the component with the specified ID from its registry

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            apiInstance.deleteRegisteredComponent1(cmdVersion, componentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteRegisteredComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## deleteRegisteredProfile

> deleteRegisteredProfile(cmdVersion, profileId)

Deletes the profile with the specified ID from its registry

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            apiInstance.deleteRegisteredProfile(cmdVersion, profileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteRegisteredProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## deleteRegisteredProfile1

> deleteRegisteredProfile1(cmdVersion, profileId)

Deletes the profile with the specified ID from its registry

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            apiInstance.deleteRegisteredProfile1(cmdVersion, profileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#deleteRegisteredProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## getCommentsFromComponent

> List&lt;Comment&gt; getCommentsFromComponent(cmdVersion, componentId)

Returns a listing of all comments that have been made on the identified component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            List<Comment> result = apiInstance.getCommentsFromComponent(cmdVersion, componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getCommentsFromComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## getCommentsFromComponent1

> List&lt;Comment&gt; getCommentsFromComponent1(cmdVersion, componentId)

Returns a listing of all comments that have been made on the identified component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            List<Comment> result = apiInstance.getCommentsFromComponent1(cmdVersion, componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getCommentsFromComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## getCommentsFromProfile

> List&lt;Comment&gt; getCommentsFromProfile(cmdVersion, profileId)

Returns a listing of all comments that have been made on the identified profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            List<Comment> result = apiInstance.getCommentsFromProfile(cmdVersion, profileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getCommentsFromProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## getCommentsFromProfile1

> List&lt;Comment&gt; getCommentsFromProfile1(cmdVersion, profileId)

Returns a listing of all comments that have been made on the identified profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            List<Comment> result = apiInstance.getCommentsFromProfile1(cmdVersion, profileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getCommentsFromProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user and user is no administrator |  -  |
| **404** | Item does not exist |  -  |


## getComponentStatus

> getComponentStatus(cmdVersion, componentId)

Gets the status of a registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            apiInstance.getComponentStatus(cmdVersion, componentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getComponentStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getComponentStatus1

> getComponentStatus1(cmdVersion, componentId)

Gets the status of a registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            apiInstance.getComponentStatus1(cmdVersion, componentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getComponentStatus1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getComponentSuccessor

> getComponentSuccessor(cmdVersion, componentId)

Gets the successor of a registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            apiInstance.getComponentSuccessor(cmdVersion, componentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getComponentSuccessor");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist (no item or no successor) |  -  |


## getComponentSuccessor1

> getComponentSuccessor1(cmdVersion, componentId)

Gets the successor of a registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            apiInstance.getComponentSuccessor1(cmdVersion, componentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getComponentSuccessor1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist (no item or no successor) |  -  |


## getComponentUsage

> List&lt;BaseDescription&gt; getComponentUsage(cmdVersion, componentId)

Returns a descriptions listing of components that use the identified component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            List<BaseDescription> result = apiInstance.getComponentUsage(cmdVersion, componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getComponentUsage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

[**List&lt;BaseDescription&gt;**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |


## getComponentUsage1

> List&lt;BaseDescription&gt; getComponentUsage1(cmdVersion, componentId)

Returns a descriptions listing of components that use the identified component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            List<BaseDescription> result = apiInstance.getComponentUsage1(cmdVersion, componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getComponentUsage1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

[**List&lt;BaseDescription&gt;**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |


## getProfileStatus

> getProfileStatus(cmdVersion, profileId)

Gets the status of a registered profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            apiInstance.getProfileStatus(cmdVersion, profileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getProfileStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getProfileStatus1

> getProfileStatus1(cmdVersion, profileId)

Gets the status of a registered profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            apiInstance.getProfileStatus1(cmdVersion, profileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getProfileStatus1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getProfileSuccessor

> getProfileSuccessor(cmdVersion, profileId)

Gets the successor of a registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            apiInstance.getProfileSuccessor(cmdVersion, profileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getProfileSuccessor");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist (no item or no successor) |  -  |


## getProfileSuccessor1

> getProfileSuccessor1(cmdVersion, profileId)

Gets the successor of a registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            apiInstance.getProfileSuccessor1(cmdVersion, profileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getProfileSuccessor1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist (no item or no successor) |  -  |


## getRegisteredComponent

> ComponentSpec getRegisteredComponent(cmdVersion, componentId)

The component specification of a single component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getRegisteredComponent(cmdVersion, componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The component specification for the identified component |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getRegisteredComponent1

> ComponentSpec getRegisteredComponent1(cmdVersion, componentId)

The component specification of a single component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getRegisteredComponent1(cmdVersion, componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The component specification for the identified component |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getRegisteredComponentRawType

> ComponentSpec getRegisteredComponentRawType(cmdVersion, componentId, rawType)

The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String rawType = "rawType_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getRegisteredComponentRawType(cmdVersion, componentId, rawType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredComponentRawType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **rawType** | **String**|  | |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The component specification for the identified profile |  -  |
| **404** | Item does not exist |  -  |


## getRegisteredComponentRawType1

> ComponentSpec getRegisteredComponentRawType1(cmdVersion, componentId, rawType)

The expanded XML or XSD represenation of the component specification of a single component (publicly accessible regardless of state!)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String rawType = "rawType_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getRegisteredComponentRawType1(cmdVersion, componentId, rawType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredComponentRawType1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **rawType** | **String**|  | |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The component specification for the identified profile |  -  |
| **404** | Item does not exist |  -  |


## getRegisteredComponents

> List&lt;ComponentDescription&gt; getRegisteredComponents(cmdVersion, registrySpace, groupId, status, userspace)

A listing of the descriptions of components in the specified registry space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String registrySpace = "published"; // String | 
        String groupId = "groupId_example"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String userspace = "userspace_example"; // String | 
        try {
            List<ComponentDescription> result = apiInstance.getRegisteredComponents(cmdVersion, registrySpace, groupId, status, userspace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredComponents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **groupId** | **String**|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userspace** | **String**|  | [optional] |

### Return type

[**List&lt;ComponentDescription&gt;**](ComponentDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Registry requires authorisation and user is not authenticated |  -  |
| **403** | Non-public registry is not owned by current user |  -  |
| **404** | Registry space does not exist |  -  |


## getRegisteredComponents1

> List&lt;ComponentDescription&gt; getRegisteredComponents1(cmdVersion, registrySpace, groupId, status, userspace)

A listing of the descriptions of components in the specified registry space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String registrySpace = "published"; // String | 
        String groupId = "groupId_example"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String userspace = "userspace_example"; // String | 
        try {
            List<ComponentDescription> result = apiInstance.getRegisteredComponents1(cmdVersion, registrySpace, groupId, status, userspace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredComponents1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **groupId** | **String**|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userspace** | **String**|  | [optional] |

### Return type

[**List&lt;ComponentDescription&gt;**](ComponentDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Registry requires authorisation and user is not authenticated |  -  |
| **403** | Non-public registry is not owned by current user |  -  |
| **404** | Registry space does not exist |  -  |


## getRegisteredProfile

> ComponentSpec getRegisteredProfile(cmdVersion, profileId)

The component specification of a single profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getRegisteredProfile(cmdVersion, profileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The component specification for the identified profile |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getRegisteredProfile1

> ComponentSpec getRegisteredProfile1(cmdVersion, profileId)

The component specification of a single profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getRegisteredProfile1(cmdVersion, profileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The component specification for the identified profile |  -  |
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## getRegisteredProfileRawType

> getRegisteredProfileRawType(cmdVersion, profileId, targetVersion, rawType)

The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String targetVersion = "targetVersion_example"; // String | 
        String rawType = "rawType_example"; // String | 
        try {
            apiInstance.getRegisteredProfileRawType(cmdVersion, profileId, targetVersion, rawType);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfileRawType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **targetVersion** | **String**|  | |
| **rawType** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Item does not exist |  -  |


## getRegisteredProfileRawType1

> getRegisteredProfileRawType1(cmdVersion, profileId, targetVersion, rawType)

The expanded XML or XSD represenation of the component specification of a single profile (publicly accessible regardless of state!)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String targetVersion = "targetVersion_example"; // String | 
        String rawType = "rawType_example"; // String | 
        try {
            apiInstance.getRegisteredProfileRawType1(cmdVersion, profileId, targetVersion, rawType);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfileRawType1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **targetVersion** | **String**|  | |
| **rawType** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Item does not exist |  -  |


## getRegisteredProfiles

> List&lt;ProfileDescription&gt; getRegisteredProfiles(cmdVersion, registrySpace, mdEditor, groupId, status, userspace)

A listing of the descriptions of profiles in the specified registry space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String registrySpace = "published"; // String | 
        Boolean mdEditor = false; // Boolean | 
        String groupId = "groupId_example"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String userspace = "userspace_example"; // String | 
        try {
            List<ProfileDescription> result = apiInstance.getRegisteredProfiles(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfiles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **mdEditor** | **Boolean**|  | [optional] [default to false] |
| **groupId** | **String**|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userspace** | **String**|  | [optional] |

### Return type

[**List&lt;ProfileDescription&gt;**](ProfileDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Registry requires authorisation and user is not authenticated |  -  |
| **403** | Non-public registry is not owned by current user |  -  |
| **404** | Registry space does not exist |  -  |


## getRegisteredProfiles1

> List&lt;ProfileDescription&gt; getRegisteredProfiles1(cmdVersion, registrySpace, mdEditor, groupId, status, userspace)

A listing of the descriptions of profiles in the specified registry space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String registrySpace = "published"; // String | 
        Boolean mdEditor = false; // Boolean | 
        String groupId = "groupId_example"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String userspace = "userspace_example"; // String | 
        try {
            List<ProfileDescription> result = apiInstance.getRegisteredProfiles1(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfiles1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **mdEditor** | **Boolean**|  | [optional] [default to false] |
| **groupId** | **String**|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userspace** | **String**|  | [optional] |

### Return type

[**List&lt;ProfileDescription&gt;**](ProfileDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Registry requires authorisation and user is not authenticated |  -  |
| **403** | Non-public registry is not owned by current user |  -  |
| **404** | Registry space does not exist |  -  |


## getRegisteredProfilesObject

> ProfileDescriptionsObject getRegisteredProfilesObject(cmdVersion, registrySpace, mdEditor, groupId, status, userspace)

A listing of the descriptions of profiles in the specified registry space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String registrySpace = "published"; // String | 
        Boolean mdEditor = false; // Boolean | 
        String groupId = "groupId_example"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String userspace = "userspace_example"; // String | 
        try {
            ProfileDescriptionsObject result = apiInstance.getRegisteredProfilesObject(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfilesObject");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **mdEditor** | **Boolean**|  | [optional] [default to false] |
| **groupId** | **String**|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userspace** | **String**|  | [optional] |

### Return type

[**ProfileDescriptionsObject**](ProfileDescriptionsObject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Registry requires authorisation and user is not authenticated |  -  |
| **403** | Non-public registry is not owned by current user |  -  |
| **404** | Registry space does not exist |  -  |


## getRegisteredProfilesObject1

> ProfileDescriptionsObject getRegisteredProfilesObject1(cmdVersion, registrySpace, mdEditor, groupId, status, userspace)

A listing of the descriptions of profiles in the specified registry space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String registrySpace = "published"; // String | 
        Boolean mdEditor = false; // Boolean | 
        String groupId = "groupId_example"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String userspace = "userspace_example"; // String | 
        try {
            ProfileDescriptionsObject result = apiInstance.getRegisteredProfilesObject1(cmdVersion, registrySpace, mdEditor, groupId, status, userspace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRegisteredProfilesObject1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **mdEditor** | **Boolean**|  | [optional] [default to false] |
| **groupId** | **String**|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userspace** | **String**|  | [optional] |

### Return type

[**ProfileDescriptionsObject**](ProfileDescriptionsObject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Registry requires authorisation and user is not authenticated |  -  |
| **403** | Non-public registry is not owned by current user |  -  |
| **404** | Registry space does not exist |  -  |


## getRssComponent

> Rss getRssComponent(cmdVersion, groupId, registrySpace, status, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String groupId = "groupId_example"; // String | 
        String registrySpace = "published"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssComponent(cmdVersion, groupId, registrySpace, status, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **groupId** | **String**|  | [optional] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssComponent1

> Rss getRssComponent1(cmdVersion, groupId, registrySpace, status, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String groupId = "groupId_example"; // String | 
        String registrySpace = "published"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssComponent1(cmdVersion, groupId, registrySpace, status, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **groupId** | **String**|  | [optional] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssOfCommentsFromComponent

> Rss getRssOfCommentsFromComponent(cmdVersion, componentId, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssOfCommentsFromComponent(cmdVersion, componentId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssOfCommentsFromComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssOfCommentsFromComponent1

> Rss getRssOfCommentsFromComponent1(cmdVersion, componentId, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssOfCommentsFromComponent1(cmdVersion, componentId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssOfCommentsFromComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssOfCommentsFromProfile

> Rss getRssOfCommentsFromProfile(cmdVersion, profileId, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssOfCommentsFromProfile(cmdVersion, profileId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssOfCommentsFromProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssOfCommentsFromProfile1

> Rss getRssOfCommentsFromProfile1(cmdVersion, profileId, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssOfCommentsFromProfile1(cmdVersion, profileId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssOfCommentsFromProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssProfile

> Rss getRssProfile(cmdVersion, groupId, registrySpace, status, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String groupId = "groupId_example"; // String | 
        String registrySpace = "published"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssProfile(cmdVersion, groupId, registrySpace, status, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **groupId** | **String**|  | [optional] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getRssProfile1

> Rss getRssProfile1(cmdVersion, groupId, registrySpace, status, limit)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String groupId = "groupId_example"; // String | 
        String registrySpace = "published"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String limit = "20"; // String | 
        try {
            Rss result = apiInstance.getRssProfile1(cmdVersion, groupId, registrySpace, status, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getRssProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **groupId** | **String**|  | [optional] |
| **registrySpace** | **String**|  | [optional] [default to published] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **String**|  | [optional] [default to 20] |

### Return type

[**Rss**](Rss.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getSpecifiedCommentFromComponent

> Comment getSpecifiedCommentFromComponent(cmdVersion, componentId, commentId)

Returns a single comment on a component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            Comment result = apiInstance.getSpecifiedCommentFromComponent(cmdVersion, componentId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getSpecifiedCommentFromComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Component requires authorisation and user is not authenticated |  -  |
| **403** | Non-public component is not owned by current user |  -  |
| **404** | Component or comment does not exist |  -  |


## getSpecifiedCommentFromComponent1

> Comment getSpecifiedCommentFromComponent1(cmdVersion, componentId, commentId)

Returns a single comment on a component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            Comment result = apiInstance.getSpecifiedCommentFromComponent1(cmdVersion, componentId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getSpecifiedCommentFromComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Component requires authorisation and user is not authenticated |  -  |
| **403** | Non-public component is not owned by current user |  -  |
| **404** | Component or comment does not exist |  -  |


## getSpecifiedCommentFromProfile

> Comment getSpecifiedCommentFromProfile(cmdVersion, profileId, commentId)

Returns a single comment on a profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            Comment result = apiInstance.getSpecifiedCommentFromProfile(cmdVersion, profileId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getSpecifiedCommentFromProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Component requires authorisation and user is not authenticated |  -  |
| **403** | Non-public component is not owned by current user |  -  |
| **404** | Component or comment does not exist |  -  |


## getSpecifiedCommentFromProfile1

> Comment getSpecifiedCommentFromProfile1(cmdVersion, profileId, commentId)

Returns a single comment on a profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        try {
            Comment result = apiInstance.getSpecifiedCommentFromProfile1(cmdVersion, profileId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#getSpecifiedCommentFromProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **commentId** | **String**|  | |

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Component requires authorisation and user is not authenticated |  -  |
| **403** | Non-public component is not owned by current user |  -  |
| **404** | Component or comment does not exist |  -  |


## manipulateCommentFromComponent

> manipulateCommentFromComponent(cmdVersion, componentId, commentId, method)

Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateCommentFromComponent(cmdVersion, componentId, commentId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateCommentFromComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **commentId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateCommentFromComponent1

> manipulateCommentFromComponent1(cmdVersion, componentId, commentId, method)

Allows for deletion of single component comment (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateCommentFromComponent1(cmdVersion, componentId, commentId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateCommentFromComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **commentId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateCommentFromProfile

> manipulateCommentFromProfile(cmdVersion, profileId, commentId, method)

Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateCommentFromProfile(cmdVersion, profileId, commentId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateCommentFromProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **commentId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateCommentFromProfile1

> manipulateCommentFromProfile1(cmdVersion, profileId, commentId, method)

Allows for deletion of single profile comment (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String commentId = "commentId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateCommentFromProfile1(cmdVersion, profileId, commentId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateCommentFromProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **commentId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateRegisteredComponent

> manipulateRegisteredComponent(cmdVersion, componentId, method)

Allows for deletion of single component (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateRegisteredComponent(cmdVersion, componentId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateRegisteredComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateRegisteredComponent1

> manipulateRegisteredComponent1(cmdVersion, componentId, method)

Allows for deletion of single component (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateRegisteredComponent1(cmdVersion, componentId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateRegisteredComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateRegisteredProfile

> manipulateRegisteredProfile(cmdVersion, profileId, method)

Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateRegisteredProfile(cmdVersion, profileId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateRegisteredProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## manipulateRegisteredProfile1

> manipulateRegisteredProfile1(cmdVersion, profileId, method)

Allows for deletion of single profile (workaround for Flex which does not support the DELETE method)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String method = "method_example"; // String | 
        try {
            apiInstance.manipulateRegisteredProfile1(cmdVersion, profileId, method);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#manipulateRegisteredProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **method** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## pingSession

> pingSession(cmdVersion)

Keeps the session alive

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        try {
            apiInstance.pingSession(cmdVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#pingSession");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## pingSession1

> pingSession1(cmdVersion)

Keeps the session alive

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        try {
            apiInstance.pingSession1(cmdVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#pingSession1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## publishRegisteredComponent

> publishRegisteredComponent(cmdVersion, componentId, data, name, description, group, domainName)

Changes the state of the specified component to published

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.publishRegisteredComponent(cmdVersion, componentId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#publishRegisteredComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## publishRegisteredComponent1

> publishRegisteredComponent1(cmdVersion, componentId, data, name, description, group, domainName)

Changes the state of the specified component to published

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.publishRegisteredComponent1(cmdVersion, componentId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#publishRegisteredComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## publishRegisteredProfile

> publishRegisteredProfile(cmdVersion, profileId, data, name, description, group, domainName)

Changes the state of the specified profile to published

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.publishRegisteredProfile(cmdVersion, profileId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#publishRegisteredProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## publishRegisteredProfile1

> publishRegisteredProfile1(cmdVersion, profileId, data, name, description, group, domainName)

Changes the state of the specified profile to published

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.publishRegisteredProfile1(cmdVersion, profileId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#publishRegisteredProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Item requires authorisation and user is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## registerCommentInComponent

> registerCommentInComponent(cmdVersion, componentId, data)

Publishes a comment on the specified component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        try {
            apiInstance.registerCommentInComponent(cmdVersion, componentId, data);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerCommentInComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **data** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## registerCommentInComponent1

> registerCommentInComponent1(cmdVersion, componentId, data)

Publishes a comment on the specified component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        try {
            apiInstance.registerCommentInComponent1(cmdVersion, componentId, data);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerCommentInComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **data** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## registerCommentInProfile

> registerCommentInProfile(cmdVersion, profileId, data)

Publishes a comment on the specified profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        try {
            apiInstance.registerCommentInProfile(cmdVersion, profileId, data);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerCommentInProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **data** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## registerCommentInProfile1

> registerCommentInProfile1(cmdVersion, profileId, data)

Publishes a comment on the specified profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        try {
            apiInstance.registerCommentInProfile1(cmdVersion, profileId, data);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerCommentInProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **data** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Non-public item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## registerComponent

> registerComponent(cmdVersion, data, name, description, group, domainName)

Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.registerComponent(cmdVersion, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Current user has no access |  -  |


## registerComponent1

> registerComponent1(cmdVersion, data, name, description, group, domainName)

Registers a component specification (data content) with the associated metadata (form content) in the user&#39;s private space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.registerComponent1(cmdVersion, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Current user has no access |  -  |


## registerProfile

> registerProfile(cmdVersion, data, name, description, group, domainName)

Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.registerProfile(cmdVersion, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Current user has no access |  -  |


## registerProfile1

> registerProfile1(cmdVersion, data, name, description, group, domainName)

Registers a profile specification (data content) with the associated metadata (form content) in the user&#39;s private space

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.registerProfile1(cmdVersion, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#registerProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Current user has no access |  -  |


## updateComponentStatus

> updateComponentStatus(cmdVersion, componentId, status)

Updates the status of an already registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String status = "status_example"; // String | 
        try {
            apiInstance.updateComponentStatus(cmdVersion, componentId, status);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateComponentStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **status** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateComponentStatus1

> updateComponentStatus1(cmdVersion, componentId, status)

Updates the status of an already registered component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String status = "status_example"; // String | 
        try {
            apiInstance.updateComponentStatus1(cmdVersion, componentId, status);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateComponentStatus1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **status** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateComponentSuccessor

> updateComponentSuccessor(cmdVersion, componentId, successor)

Sets the successor for a registered component (must have deprecated status)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String successor = "successor_example"; // String | 
        try {
            apiInstance.updateComponentSuccessor(cmdVersion, componentId, successor);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateComponentSuccessor");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **successor** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateComponentSuccessor1

> updateComponentSuccessor1(cmdVersion, componentId, successor)

Sets the successor for a registered component (must have deprecated status)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        String successor = "successor_example"; // String | 
        try {
            apiInstance.updateComponentSuccessor1(cmdVersion, componentId, successor);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateComponentSuccessor1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **successor** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateProfileStatus

> updateProfileStatus(cmdVersion, profileId, status)

Updates the status of an already registered profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String status = "status_example"; // String | 
        try {
            apiInstance.updateProfileStatus(cmdVersion, profileId, status);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateProfileStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **status** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateProfileStatus1

> updateProfileStatus1(cmdVersion, profileId, status)

Updates the status of an already registered profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String status = "status_example"; // String | 
        try {
            apiInstance.updateProfileStatus1(cmdVersion, profileId, status);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateProfileStatus1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **status** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateProfileSuccessor

> updateProfileSuccessor(cmdVersion, profileId, successor)

Sets the successor for a registered profile (must have deprecated status)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String successor = "successor_example"; // String | 
        try {
            apiInstance.updateProfileSuccessor(cmdVersion, profileId, successor);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateProfileSuccessor");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **successor** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateProfileSuccessor1

> updateProfileSuccessor1(cmdVersion, profileId, successor)

Sets the successor for a registered profile (must have deprecated status)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        String successor = "successor_example"; // String | 
        try {
            apiInstance.updateProfileSuccessor1(cmdVersion, profileId, successor);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateProfileSuccessor1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **successor** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateRegisteredComponent

> updateRegisteredComponent(cmdVersion, componentId, data, name, description, group, domainName)

Updates an already registered (but unpublished) component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.updateRegisteredComponent(cmdVersion, componentId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateRegisteredComponent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateRegisteredComponent1

> updateRegisteredComponent1(cmdVersion, componentId, data, name, description, group, domainName)

Updates an already registered (but unpublished) component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String componentId = "componentId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.updateRegisteredComponent1(cmdVersion, componentId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateRegisteredComponent1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **componentId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateRegisteredProfile

> updateRegisteredProfile(cmdVersion, profileId, data, name, description, group, domainName)

Updates an already registered (but unpublished) profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.updateRegisteredProfile(cmdVersion, profileId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateRegisteredProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |


## updateRegisteredProfile1

> updateRegisteredProfile1(cmdVersion, profileId, data, name, description, group, domainName)

Updates an already registered (but unpublished) profile

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        RegistryApi apiInstance = new RegistryApi(defaultClient);
        String cmdVersion = "1.1"; // String | 
        String profileId = "profileId_example"; // String | 
        File data = new File("/path/to/file"); // File | 
        String name = "name_example"; // String | 
        String description = "description_example"; // String | 
        String group = "group_example"; // String | 
        String domainName = "domainName_example"; // String | 
        try {
            apiInstance.updateRegisteredProfile1(cmdVersion, profileId, data, name, description, group, domainName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistryApi#updateRegisteredProfile1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cmdVersion** | **String**|  | [default to 1.1] |
| **profileId** | **String**|  | |
| **data** | **File**|  | [optional] |
| **name** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **domainName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | User is not authenticated |  -  |
| **403** | Item is not owned by current user |  -  |
| **404** | Item does not exist |  -  |

