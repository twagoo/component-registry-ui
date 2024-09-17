#!/usr/bin/env bash

export OPENAPI_GENERATOR_VERSION=7.7.0

BASE_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )/openapi-generator"
mkdir -p "${BASE_DIR}"

CLI_TOOL="${BASE_DIR}/openapi-generator-cli"

if ! [ -e "${CLI_TOOL}" ]; then
	echo "Fetching OpenAPI generator CLI script"
	curl -s 'https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh' > "${CLI_TOOL}"
	chmod u+x "${CLI_TOOL}"
fi

"${CLI_TOOL}" generate \
  -i http://petstore.swagger.io/v2/swagger.json \
  --api-package com.baeldung.petstore.client.api \
  --model-package com.baeldung.petstore.client.model \
  --invoker-package com.baeldung.petstore.client.invoker \
  --group-id com.baeldung \
  --artifact-id spring-openapi-generator-api-client \
  --artifact-version 0.0.1-SNAPSHOT \
  -g java \
  -p java8=true \
  --library resttemplate \
  -o spring-openapi-generator-api-client