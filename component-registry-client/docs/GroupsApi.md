# GroupsApi

All URIs are relative to *https://catalog.clarin.eu/ds/ComponentRegistry/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroupsTheCurrentUserIsAMemberOf**](GroupsApi.md#getGroupsTheCurrentUserIsAMemberOf) | **GET** /groups/usermembership | Returns a listing of groups the current user is a member of (empty list when unauthenticated) |



## getGroupsTheCurrentUserIsAMemberOf

> List&lt;Group&gt; getGroupsTheCurrentUserIsAMemberOf()

Returns a listing of groups the current user is a member of (empty list when unauthenticated)

### Example

```java
// Import classes:
import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.Configuration;
import eu.clarin.cmdi.componentregistry.openapi.client.models.*;
import eu.clarin.cmdi.componentregistry.openapi.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://catalog.clarin.eu/ds/ComponentRegistry/rest");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        try {
            List<Group> result = apiInstance.getGroupsTheCurrentUserIsAMemberOf();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroupsTheCurrentUserIsAMemberOf");
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

