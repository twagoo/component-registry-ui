# Component Registry REST service client

A client is generated on basis of the API specification.

## Build

### Generator the client

To (re)generate the client, follow these steps:

* Optional: update the `spec/openapi.json` file
  * Make sure the server is running and retrieve the file
    * `curl -o spec/openapi.json http://localhost:8080/rest/openapi.json`
* Run the `initialize` phase of the project in `generator`:
  * `mvn -f openapi-client-generator initialize`
* Build the project in `component-registry-client`:
  * `mvn -f component-registry-client clean install`

Important note! Due to an apparent issue in the generator, the following
dependency must be manually be upgraded to the 2.x version after generation:

```xml
        <dependency>
            <groupId>io.github.threeten-jaxb</groupId>
            <artifactId>threeten-jaxb-core</artifactId>
            <version>2.2.0</version>
        </dependency>
```

## References

* [OpenAPI generator Maven plugin documentation](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
* [OpenAPI java client generator documentation](https://openapi-generator.tech/docs/generators/java/)
