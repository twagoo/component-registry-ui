# ItemsControllerApi

All URIs are relative to *http://localhost:8080/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getItem**](ItemsControllerApi.md#getItem) | **GET** /registry/items/{componentId} |  |
| [**getItemSpec**](ItemsControllerApi.md#getItemSpec) | **GET** /registry/items/{componentId}/spec | Get the specification for the profile or component |
| [**getItems**](ItemsControllerApi.md#getItems) | **GET** /registry/items |  |



## getItem

> BaseDescription getItem(componentId)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");

        ItemsControllerApi apiInstance = new ItemsControllerApi(defaultClient);
        String componentId = "componentId_example"; // String | 
        try {
            BaseDescription result = apiInstance.getItem(componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsControllerApi#getItem");
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
| **componentId** | **String**|  | |

### Return type

[**BaseDescription**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItemSpec

> ComponentSpec getItemSpec(componentId, accept)

Get the specification for the profile or component

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");

        ItemsControllerApi apiInstance = new ItemsControllerApi(defaultClient);
        String componentId = "componentId_example"; // String | 
        String accept = "accept_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getItemSpec(componentId, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsControllerApi#getItemSpec");
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
| **componentId** | **String**|  | |
| **accept** | **String**|  | [optional] |

### Return type

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Item not found |  -  |
| **200** | OK |  -  |


## getItems

> List&lt;BaseDescription&gt; getItems(type, status, sortBy, sortDirection)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ItemsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");

        ItemsControllerApi apiInstance = new ItemsControllerApi(defaultClient);
        String type = "COMPONENT"; // String | 
        List<String> status = Arrays.asList(); // List<String> | 
        String sortBy = "name"; // String | 
        String sortDirection = "ASC"; // String | 
        try {
            List<BaseDescription> result = apiInstance.getItems(type, status, sortBy, sortDirection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsControllerApi#getItems");
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
| **type** | **String**|  | [optional] [enum: COMPONENT, PROFILE] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: development, production, deprecated] |
| **sortBy** | **String**|  | [optional] [default to name] |
| **sortDirection** | **String**|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**List&lt;BaseDescription&gt;**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

