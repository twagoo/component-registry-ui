# AuthenticationApi

All URIs are relative to *https://catalog.clarin.eu/ds/ComponentRegistry/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthenticationInformation**](AuthenticationApi.md#getAuthenticationInformation) | **GET** /authentication | Information on the current authentication state. Pass &#39;redirect&#39; query parameter to make this method redirect to the URI specified as its value. |
| [**triggerAuthenticationRequest**](AuthenticationApi.md#triggerAuthenticationRequest) | **POST** /authentication | Triggers the service to require the client to authenticate by means of the configured authentication mechanism. Notice that this might require user interaction! |



## getAuthenticationInformation

> getAuthenticationInformation(redirect)

Information on the current authentication state. Pass &#39;redirect&#39; query parameter to make this method redirect to the URI specified as its value.

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String redirect = "redirect_example"; // String | 
        try {
            apiInstance.getAuthenticationInformation(redirect);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getAuthenticationInformation");
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
| **redirect** | **String**|  | [optional] |

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
| **200** | If no query parameters are passed, with the authentications status in its body |  -  |
| **303** | A redirect to the URI provided as the value of the &#39;redirect&#39; parameter |  -  |


## triggerAuthenticationRequest

> triggerAuthenticationRequest()

Triggers the service to require the client to authenticate by means of the configured authentication mechanism. Notice that this might require user interaction!

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            apiInstance.triggerAuthenticationRequest();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#triggerAuthenticationRequest");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **303** | A redirect, either to a Shibboleth authentication page/discovery service or other identification mechanism, and ultimately to the same URI as requested (which should be picked up as a GET) |  -  |
| **401** | If unauthenticated, a request to authenticate may be returned (not in case of Shibboleth authentication) |  -  |

