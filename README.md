# Component Registry REST service client

A client is generated on basis of the API specification.

## Build

### Generator the client

To (re)generate the client, follow these steps:

* Optional: update the `spec/openapi.json` file
  * Make sure the server is running and retrieve the file
    * `curl -o spec/openapi.json http://localhost:8080/rest/openapi.json`
* Run the `initialize` phase of the project in `generator`:
  * `mvn -f generator initialize`
* Build the project in `component-registry-client`:
  * `mvn -f component-registry-client clean install`
