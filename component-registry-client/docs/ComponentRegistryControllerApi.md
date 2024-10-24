# ComponentRegistryControllerApi

All URIs are relative to *http://localhost:8080/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getItem**](ComponentRegistryControllerApi.md#getItem) | **GET** /registry/items/{componentId} |  |
| [**getItemSpec**](ComponentRegistryControllerApi.md#getItemSpec) | **GET** /registry/items/{componentId}/spec |  |
| [**getItems**](ComponentRegistryControllerApi.md#getItems) | **GET** /registry/items |  |



## getItem

> BaseDescription getItem(componentId)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ComponentRegistryControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");

        ComponentRegistryControllerApi apiInstance = new ComponentRegistryControllerApi(defaultClient);
        String componentId = "componentId_example"; // String | 
        try {
            BaseDescription result = apiInstance.getItem(componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComponentRegistryControllerApi#getItem");
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
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItemSpec

> ComponentSpec getItemSpec(componentId)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ComponentRegistryControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");

        ComponentRegistryControllerApi apiInstance = new ComponentRegistryControllerApi(defaultClient);
        String componentId = "componentId_example"; // String | 
        try {
            ComponentSpec result = apiInstance.getItemSpec(componentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComponentRegistryControllerApi#getItemSpec");
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

[**ComponentSpec**](ComponentSpec.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItems

> List&lt;BaseDescription&gt; getItems(sortBy, sortDirection)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.ComponentRegistryControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");

        ComponentRegistryControllerApi apiInstance = new ComponentRegistryControllerApi(defaultClient);
        String sortBy = "name"; // String | 
        String sortDirection = "ASC"; // String | 
        try {
            List<BaseDescription> result = apiInstance.getItems(sortBy, sortDirection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComponentRegistryControllerApi#getItems");
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
| **sortBy** | **String**|  | [optional] [default to name] |
| **sortDirection** | **String**|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**List&lt;BaseDescription&gt;**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

