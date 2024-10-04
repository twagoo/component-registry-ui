# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExternalGrammar**](DefaultApi.md#getExternalGrammar) | **GET** /rest/application.wadl/{path} |  |
| [**getItems**](DefaultApi.md#getItems) | **GET** /rest/registry/items |  |
| [**getTestItem**](DefaultApi.md#getTestItem) | **GET** /rest/registry/test |  |
| [**getWadl**](DefaultApi.md#getWadl) | **GET** /rest/application.wadl |  |



## getExternalGrammar

> getExternalGrammar(path)



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String path = "path_example"; // String | 
        try {
            apiInstance.getExternalGrammar(path);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getExternalGrammar");
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
| **path** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## getItems

> List&lt;BaseDescription&gt; getItems()



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<BaseDescription> result = apiInstance.getItems();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;BaseDescription&gt;**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## getTestItem

> BaseDescription getTestItem()



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            BaseDescription result = apiInstance.getTestItem();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTestItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**BaseDescription**](BaseDescription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## getWadl

> getWadl()



### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.getWadl();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getWadl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.sun.wadl+xml, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

