package eu.clarin.cmdi.componentregistry.ui;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ProfileDescription;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

/**
 *
 * @author twagoo
 */
@SpringBootTest
@Slf4j
public class ComponentRegistryRestClientTest {

    public final String serviceUrl = "http://localhost:8080/ds/ComponentRegistry/rest/";

    @Test
    public void testConnect() {
        
        RestClient restClient = ApiClient.buildRestClientBuilder().baseUrl(serviceUrl)
                .build();
//        RestClient restClient = RestClient.builder()
//                .requestFactory(new HttpComponentsClientHttpRequestFactory())
//                //.messageConverters(converters -> converters.add(new MyCustomMessageConverter()))
//                .baseUrl(serviceUrl)
//                //.defaultUriVariables(Map.of("variable", "foo"))
//                //.defaultHeader("My-Header", "Foo")
//                //.requestInterceptor(myCustomInterceptor)
//                //.requestInitializer(myCustomInitializer)
//                .build();
//
        RestClient.ResponseSpec response = restClient.get()
                .uri("registry/profiles/clarin.eu:cr1:p_1361876010587")
                .retrieve();
//        ResponseEntity<List<ProfileDescription>> profiles= response.toEntity(new ParameterizedTypeReference<List<ProfileDescription>>() {
//        });
//        log.info("Profiles: {}", profiles);
        ResponseEntity<ProfileDescription> profile = response.toEntity(ProfileDescription.class);
        log.info("Profile: {}", profile);
    }
}
