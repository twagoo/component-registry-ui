/*
 * CompReg client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.clarin.cmdi.componentregistry.openapi.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.util.function.Consumer;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.InvalidMediaTypeException;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClient.ResponseSpec;
import java.util.Optional;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;

import jakarta.annotation.Nullable;

import java.time.OffsetDateTime;

import eu.clarin.cmdi.componentregistry.openapi.client.auth.Authentication;
import eu.clarin.cmdi.componentregistry.openapi.client.auth.HttpBasicAuth;
import eu.clarin.cmdi.componentregistry.openapi.client.auth.HttpBearerAuth;
import eu.clarin.cmdi.componentregistry.openapi.client.auth.ApiKeyAuth;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-19T11:53:09.778121+03:00[Europe/Riga]", comments = "Generator version: 7.8.0")
public class ApiClient extends JavaTimeFormatter {
    public enum CollectionFormat {
        CSV(","), TSV("\t"), SSV(" "), PIPES("|"), MULTI(null);

        private final String separator;
        CollectionFormat(String separator) {
            this.separator = separator;
        }

        private String collectionToString(Collection<?> collection) {
            return StringUtils.collectionToDelimitedString(collection, separator);
        }
    }

    private final HttpHeaders defaultHeaders = new HttpHeaders();
    private final MultiValueMap<String, String> defaultCookies = new LinkedMultiValueMap<>();

    private String basePath = "http://localhost";

    private final RestClient restClient;
    private final DateFormat dateFormat;
    private final ObjectMapper objectMapper;

    private Map<String, Authentication> authentications;


    public ApiClient() {
        this.dateFormat = createDefaultDateFormat();
        this.objectMapper = createDefaultObjectMapper(this.dateFormat);
        this.restClient = buildRestClient(this.objectMapper);
        this.init();
    }

    public ApiClient(RestClient restClient) {
        this(Optional.ofNullable(restClient).orElseGet(ApiClient::buildRestClient), createDefaultDateFormat());
    }

    public ApiClient(ObjectMapper mapper, DateFormat format) {
        this(buildRestClient(mapper.copy()), format);
    }

    public ApiClient(RestClient restClient, ObjectMapper mapper, DateFormat format) {
        this(Optional.ofNullable(restClient).orElseGet(() -> buildRestClient(mapper.copy())), format);
    }

    private ApiClient(RestClient restClient, DateFormat format) {
        this.restClient = restClient;
        this.dateFormat = format;
        this.objectMapper = createDefaultObjectMapper(format);
        this.init();
    }

    public static DateFormat createDefaultDateFormat() {
        DateFormat dateFormat = new RFC3339DateFormat();
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat;
    }

    public static ObjectMapper createDefaultObjectMapper(@Nullable DateFormat dateFormat) {
        if (null == dateFormat) {
            dateFormat = createDefaultDateFormat();
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(dateFormat);
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNullableModule jnm = new JsonNullableModule();
        mapper.registerModule(jnm);
        return mapper;
    }

    protected void init() {
        // Setup authentications (key: authentication name, value: authentication).
        authentications = new HashMap<>();
        // Prevent the authentications from being modified.
        authentications = Collections.unmodifiableMap(authentications);
    }

    /**
    * Build the RestClientBuilder used to make RestClient.
    * @param mapper ObjectMapper used for serialize/deserialize
    * @return RestClient
    */
    public static RestClient.Builder buildRestClientBuilder(ObjectMapper mapper) {
        Consumer<List<HttpMessageConverter<?>>> messageConverters = converters -> {
            converters.add(new MappingJackson2HttpMessageConverter(mapper));
        };

        return RestClient.builder().messageConverters(messageConverters);
    }

    /**
     * Build the RestClientBuilder used to make RestClient.
     * @return RestClient
     */
    public static RestClient.Builder buildRestClientBuilder() {
        return buildRestClientBuilder(createDefaultObjectMapper(null));
    }

    /**
     * Build the RestClient used to make HTTP requests.
     * @param mapper ObjectMapper used for serialize/deserialize
     * @return RestClient
     */
    public static RestClient buildRestClient(ObjectMapper mapper) {
        return buildRestClientBuilder(mapper).build();
    }

    /**
     * Build the RestClient used to make HTTP requests.
     * @return RestClient
     */
    public static RestClient buildRestClient() {
        return buildRestClientBuilder(createDefaultObjectMapper(null)).build();
    }

    /**
     * Get the current base path
     * @return String the base path
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Set the base path, which should include the host
     * @param basePath the base path
     * @return ApiClient this client
     */
    public ApiClient setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * Get authentications (key: authentication name, value: authentication).
     * @return Map the currently configured authentication types
     */
    public Map<String, Authentication> getAuthentications() {
        return authentications;
    }

    /**
     * Get authentication for the given name.
     *
     * @param authName The authentication name
     * @return The authentication, null if not found
     */
    public Authentication getAuthentication(String authName) {
        return authentications.get(authName);
    }

    /**
     * Helper method to set access token for the first Bearer authentication.
     * @param bearerToken Bearer token
     */
    public void setBearerToken(String bearerToken) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBearerAuth) {
                ((HttpBearerAuth) auth).setBearerToken(bearerToken);
                return;
            }
        }
        throw new RuntimeException("No Bearer authentication configured!");
    }

    /**
     * Helper method to set username for the first HTTP basic authentication.
     * @param username the username
     */
    public void setUsername(String username) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBasicAuth) {
                ((HttpBasicAuth) auth).setUsername(username);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }

    /**
     * Helper method to set password for the first HTTP basic authentication.
     * @param password the password
     */
    public void setPassword(String password) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBasicAuth) {
                ((HttpBasicAuth) auth).setPassword(password);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }

    /**
     * Helper method to set API key value for the first API key authentication.
     * @param apiKey the API key
     */
    public void setApiKey(String apiKey) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof ApiKeyAuth) {
                ((ApiKeyAuth) auth).setApiKey(apiKey);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }

    /**
     * Helper method to set API key prefix for the first API key authentication.
     * @param apiKeyPrefix the API key prefix
     */
    public void setApiKeyPrefix(String apiKeyPrefix) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof ApiKeyAuth) {
                ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }

    /**
     * Set the User-Agent header's value (by adding to the default header map).
     * @param userAgent the user agent string
     * @return ApiClient this client
     */
    public ApiClient setUserAgent(String userAgent) {
        addDefaultHeader("User-Agent", userAgent);
        return this;
    }

    /**
     * Add a default header.
     *
     * @param name The header's name
     * @param value The header's value
     * @return ApiClient this client
     */
    public ApiClient addDefaultHeader(String name, String value) {
        if (defaultHeaders.containsKey(name)) {
            defaultHeaders.remove(name);
        }
        defaultHeaders.add(name, value);
        return this;
    }

    /**
     * Add a default cookie.
     *
     * @param name The cookie's name
     * @param value The cookie's value
     * @return ApiClient this client
     */
    public ApiClient addDefaultCookie(String name, String value) {
        if (defaultCookies.containsKey(name)) {
            defaultCookies.remove(name);
        }
        defaultCookies.add(name, value);
        return this;
    }

    /**
     * Get the date format used to parse/format date parameters.
     * @return DateFormat format
     */
    public DateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * Parse the given string into Date object.
     */
    public Date parseDate(String str) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Format the given Date object into string.
     */
    public String formatDate(Date date) {
        return dateFormat.format(date);
    }

    /**
     * Get the ObjectMapper used to make HTTP requests.
     * @return ObjectMapper objectMapper
     */
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    /**
     * Get the RestClient used to make HTTP requests.
     * @return RestClient restClient
     */
    public RestClient getRestClient() {
        return restClient;
    }

    /**
     * Format the given parameter object into string.
     * @param param the object to convert
     * @return String the parameter represented as a String
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } else if (param instanceof Date) {
            return formatDate( (Date) param);
        } else if (param instanceof OffsetDateTime) {
            return formatOffsetDateTime((OffsetDateTime) param);
        } else if (param instanceof Collection) {
            StringBuilder b = new StringBuilder();
            for(Object o : (Collection<?>) param) {
                if(b.length() > 0) {
                    b.append(",");
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } else {
            return String.valueOf(param);
        }
    }

    /**
     * Converts a parameter to a {@link MultiValueMap} for use in REST requests
     * @param collectionFormat The format to convert to
     * @param name The name of the parameter
     * @param value The parameter's value
     * @return a Map containing the String value(s) of the input parameter
     */
    public MultiValueMap<String, String> parameterToMultiValueMap(CollectionFormat collectionFormat, String name, Object value) {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        if (name == null || name.isEmpty() || value == null) {
            return params;
        }

        if(collectionFormat == null) {
            collectionFormat = CollectionFormat.CSV;
        }

        if (value instanceof Map) {
            @SuppressWarnings("unchecked")
            final Map<String, Object> valuesMap = (Map<String, Object>) value;
            for (final Entry<String, Object> entry : valuesMap.entrySet()) {
                params.add(entry.getKey(), parameterToString(entry.getValue()));
            }
            return params;
        }

        Collection<?> valueCollection = null;
        if (value instanceof Collection) {
            valueCollection = (Collection<?>) value;
        } else {
            params.add(name, parameterToString(value));
            return params;
        }

        if (valueCollection.isEmpty()){
            return params;
        }

        if (collectionFormat.equals(CollectionFormat.MULTI)) {
            for (Object item : valueCollection) {
                params.add(name, parameterToString(item));
            }
            return params;
        }

        List<String> values = new ArrayList<>();
        for(Object o : valueCollection) {
            values.add(parameterToString(o));
        }
        params.add(name, collectionFormat.collectionToString(values));

        return params;
    }

    /**
    * Check if the given {@code String} is a JSON MIME.
    * @param mediaType the input MediaType
    * @return boolean true if the MediaType represents JSON, false otherwise
    */
    public boolean isJsonMime(String mediaType) {
        // "* / *" is default to JSON
        if ("*/*".equals(mediaType)) {
            return true;
        }

        try {
            return isJsonMime(MediaType.parseMediaType(mediaType));
        } catch (InvalidMediaTypeException e) {
        }
        return false;
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *     application/json
     *     application/json; charset=UTF8
     *     APPLICATION/JSON
     * @param mediaType the input MediaType
     * @return boolean true if the MediaType represents JSON, false otherwise
     */
    public boolean isJsonMime(MediaType mediaType) {
        return mediaType != null && (MediaType.APPLICATION_JSON.isCompatibleWith(mediaType) || mediaType.getSubtype().matches("^.*(\\+json|ndjson)[;]?\\s*$"));
    }

    /**
    * Check if the given {@code String} is a Problem JSON MIME (RFC-7807).
    * @param mediaType the input MediaType
    * @return boolean true if the MediaType represents Problem JSON, false otherwise
    */
    public boolean isProblemJsonMime(String mediaType) {
        return "application/problem+json".equalsIgnoreCase(mediaType);
    }

    /**
     * Select the Accept header's value from the given accepts array:
     *     if JSON exists in the given array, use it;
     *     otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return List The list of MediaTypes to use for the Accept header
     */
    public List<MediaType> selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            MediaType mediaType = MediaType.parseMediaType(accept);
            if (isJsonMime(mediaType) && !isProblemJsonMime(accept)) {
                return Collections.singletonList(mediaType);
            }
        }
        return MediaType.parseMediaTypes(StringUtils.arrayToCommaDelimitedString(accepts));
    }

    /**
     * Select the Content-Type header's value from the given array:
     *     if JSON exists in the given array, use it;
     *     otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return MediaType The Content-Type header to use. If the given array is empty, null will be returned.
     */
    public MediaType selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0) {
            return null;
        }
        for (String contentType : contentTypes) {
            MediaType mediaType = MediaType.parseMediaType(contentType);
            if (isJsonMime(mediaType)) {
                return mediaType;
            }
        }
        return MediaType.parseMediaType(contentTypes[0]);
    }

    /**
    * Select the body to use for the request
    *
    * @param obj the body object
    * @param formParams the form parameters
    * @param contentType the content type of the request
    * @return Object the selected body
    */
    protected Object selectBody(Object obj, MultiValueMap<String, Object> formParams, MediaType contentType) {
        boolean isForm = MediaType.MULTIPART_FORM_DATA.isCompatibleWith(contentType) || MediaType.APPLICATION_FORM_URLENCODED.isCompatibleWith(contentType);
        return isForm ? formParams : obj;
    }

    /**
     * Invoke API by sending HTTP request with the given options.
     *
     * @param <T> the return type to use
     * @param path The sub-path of the HTTP URL
     * @param method The request method
     * @param pathParams The path parameters
     * @param queryParams The query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param accept The request's Accept header
     * @param contentType The request's Content-Type header
     * @param authNames The authentications to apply
     * @param returnType The return type into which to deserialize the response
     * @return The response body in chosen type
     */
    public <T> ResponseSpec invokeAPI(String path, HttpMethod method, Map<String, Object> pathParams, MultiValueMap<String, String> queryParams, Object body, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams, MultiValueMap<String, Object> formParams, List<MediaType> accept, MediaType contentType, String[] authNames, ParameterizedTypeReference<T> returnType) throws RestClientException {
        final RestClient.RequestBodySpec requestBuilder = prepareRequest(path, method, pathParams, queryParams, body, headerParams, cookieParams, formParams, accept, contentType, authNames);
        return requestBuilder.retrieve();
    }

    /**
     * Include queryParams in uriParams taking into account the paramName
     * @param queryParams The query parameters
     * @param uriParams The path parameters
     * return templatized query string
     */
    private String generateQueryUri(MultiValueMap<String, String> queryParams, Map<String, Object> uriParams) {
        StringBuilder queryBuilder = new StringBuilder();
        queryParams.forEach((name, values) -> {
            if (CollectionUtils.isEmpty(values)) {
                if (queryBuilder.length() != 0) {
                    queryBuilder.append('&');
                }
                queryBuilder.append(name);
            } else {
                int valueItemCounter = 0;
                for (Object value : values) {
                    if (queryBuilder.length() != 0) {
                        queryBuilder.append('&');
                    }
                    queryBuilder.append(name);
                    if (value != null) {
                        String templatizedKey = name + valueItemCounter++;
                        uriParams.put(templatizedKey, value.toString());
                        queryBuilder.append('=').append("{").append(templatizedKey).append("}");
                    }
                }
            }
        });
        return queryBuilder.toString();
    }

    private RestClient.RequestBodySpec prepareRequest(String path, HttpMethod method, Map<String, Object> pathParams,
        MultiValueMap<String, String> queryParams, Object body, HttpHeaders headerParams,
        MultiValueMap<String, String> cookieParams, MultiValueMap<String, Object> formParams, List<MediaType> accept,
        MediaType contentType, String[] authNames) {
        updateParamsForAuth(authNames, queryParams, headerParams, cookieParams);

        final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(basePath).path(path);

        String finalUri = builder.build(false).toUriString();
        Map<String, Object> uriParams = new HashMap<>();
        uriParams.putAll(pathParams);

        if (queryParams != null && !queryParams.isEmpty()) {
            //Include queryParams in uriParams taking into account the paramName
            String queryUri = generateQueryUri(queryParams, uriParams);
            //Append to finalUri the templatized query string like "?param1={param1Value}&.......
            finalUri += "?" + queryUri;
        }

        final RestClient.RequestBodySpec requestBuilder = restClient.method(method).uri(finalUri, uriParams);

        if (accept != null) {
            requestBuilder.accept(accept.toArray(new MediaType[accept.size()]));
        }
        if(contentType != null) {
            requestBuilder.contentType(contentType);
        }

        addHeadersToRequest(headerParams, requestBuilder);
        addHeadersToRequest(defaultHeaders, requestBuilder);
        addCookiesToRequest(cookieParams, requestBuilder);
        addCookiesToRequest(defaultCookies, requestBuilder);

        var selectedBody = selectBody(body, formParams, contentType);
        if (selectedBody != null) {
          requestBuilder.body(selectedBody);
        }

        return requestBuilder;
    }

    /**
     * Add headers to the request that is being built
     * @param headers The headers to add
     * @param requestBuilder The current request
     */
    protected void addHeadersToRequest(HttpHeaders headers, RestClient.RequestBodySpec requestBuilder) {
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            List<String> values = entry.getValue();
            for(String value : values) {
                if (value != null) {
                    requestBuilder.header(entry.getKey(), value);
                }
            }
        }
    }

     /**
     * Add cookies to the request that is being built
     *
     * @param cookies        The cookies to add
     * @param requestBuilder The current request
     */
    protected void addCookiesToRequest(MultiValueMap<String, String> cookies, RestClient.RequestBodySpec requestBuilder) {
        if (!cookies.isEmpty()) {
            requestBuilder.header("Cookie", buildCookieHeader(cookies));
        }
    }

    /**
     * Build cookie header. Keeps a single value per cookie (as per <a href="https://tools.ietf.org/html/rfc6265#section-5.3">
     * RFC6265 section 5.3</a>).
     *
     * @param cookies map all cookies
     * @return header string for cookies.
     */
    private String buildCookieHeader(MultiValueMap<String, String> cookies) {
        final StringBuilder cookieValue = new StringBuilder();
        String delimiter = "";
        for (final Map.Entry<String, List<String>> entry : cookies.entrySet()) {
            final String value = entry.getValue().get(entry.getValue().size() - 1);
            cookieValue.append(String.format("%s%s=%s", delimiter, entry.getKey(), value));
            delimiter = "; ";
        }
        return cookieValue.toString();
    }

    /**
     * Update query and header parameters based on authentication settings.
     *
     * @param authNames The authentications to apply
     * @param queryParams The query parameters
     * @param headerParams The header parameters
     * @param cookieParams the cookie parameters
     */
    protected void updateParamsForAuth(String[] authNames, MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams) {
        for (String authName : authNames) {
            Authentication auth = authentications.get(authName);
            if (auth == null) {
                throw new RestClientException("Authentication undefined: " + authName);
            }
            auth.applyToParams(queryParams, headerParams, cookieParams);
        }
    }

    /**
    * Formats the specified collection path parameter to a string value.
    *
    * @param collectionFormat The collection format of the parameter.
    * @param values The values of the parameter.
    * @return String representation of the parameter
    */
    public String collectionPathParameterToString(CollectionFormat collectionFormat, Collection<?> values) {
        // create the value based on the collection format
        if (CollectionFormat.MULTI.equals(collectionFormat)) {
            // not valid for path params
            return parameterToString(values);
        }

         // collectionFormat is assumed to be "csv" by default
        if(collectionFormat == null) {
            collectionFormat = CollectionFormat.CSV;
        }

        return collectionFormat.collectionToString(values);
    }
}