# ItemsApi

All URIs are relative to *https://catalog.clarin.eu/ds/ComponentRegistry/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBaseDescription**](ItemsApi.md#getBaseDescription) | **GET** /items/{itemId} | The description (metadata) of a single component or profile item |
| [**getGroupsTheItemIsAMemberOf**](ItemsApi.md#getGroupsTheItemIsAMemberOf) | **GET** /items/{itemId}/groups | Returns a listing of groups to which an item belongs |
| [**getItemLock**](ItemsApi.md#getItemLock) | **GET** /items/{itemId}/lock |  |
| [**getItemRights**](ItemsApi.md#getItemRights) | **GET** /items/{itemId}/rights | Returns information about the rights to an item for the current user |
| [**putItemLock**](ItemsApi.md#putItemLock) | **PUT** /items/{itemId}/lock |  |
| [**removeItemLock**](ItemsApi.md#removeItemLock) | **DELETE** /items/{itemId}/lock |  |
| [**transferItemOwnershipToGroup**](ItemsApi.md#transferItemOwnershipToGroup) | **POST** /items/{itemId}/transferownership | Transfers an item to the specified group (either from the private space or another group) |



## getBaseDescription

> BaseDescription getBaseDescription(itemId)

The description (metadata) of a single component or profile item

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        try {
            BaseDescription result = apiInstance.getBaseDescription(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getBaseDescription");
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
| **itemId** | **String**|  | |

### Return type

[**BaseDescription**](BaseDescription.md)

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


## getGroupsTheItemIsAMemberOf

> List&lt;Group&gt; getGroupsTheItemIsAMemberOf(itemId)

Returns a listing of groups to which an item belongs

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        try {
            List<Group> result = apiInstance.getGroupsTheItemIsAMemberOf(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getGroupsTheItemIsAMemberOf");
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
| **itemId** | **String**|  | |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getItemLock

> getItemLock(itemId)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        try {
            apiInstance.getItemLock(itemId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemLock");
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
| **itemId** | **String**|  | |

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


## getItemRights

> ItemRights getItemRights(itemId)

Returns information about the rights to an item for the current user

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        try {
            ItemRights result = apiInstance.getItemRights(itemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemRights");
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
| **itemId** | **String**|  | |

### Return type

[**ItemRights**](ItemRights.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## putItemLock

> putItemLock(itemId)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        try {
            apiInstance.putItemLock(itemId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#putItemLock");
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
| **itemId** | **String**|  | |

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


## removeItemLock

> removeItemLock(itemId)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        try {
            apiInstance.removeItemLock(itemId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#removeItemLock");
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
| **itemId** | **String**|  | |

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


## transferItemOwnershipToGroup

> transferItemOwnershipToGroup(itemId, groupId)

Transfers an item to the specified group (either from the private space or another group)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String itemId = "itemId_example"; // String | 
        Long groupId = 56L; // Long | 
        try {
            apiInstance.transferItemOwnershipToGroup(itemId, groupId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#transferItemOwnershipToGroup");
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
| **itemId** | **String**|  | |
| **groupId** | **Long**|  | [optional] |

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
| **403** | Current user has no access |  -  |

