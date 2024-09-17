# DefaultApi

All URIs are relative to *https://catalog.clarin.eu/ds/ComponentRegistry/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllowedAttributeTypes**](DefaultApi.md#getAllowedAttributeTypes) | **GET** /allowedTypes | A listing of values that are allowed as element or attribute type by the CMDI schema |



## getAllowedAttributeTypes

> Object getAllowedAttributeTypes()

A listing of values that are allowed as element or attribute type by the CMDI schema

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
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            Object result = apiInstance.getAllowedAttributeTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAllowedAttributeTypes");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

