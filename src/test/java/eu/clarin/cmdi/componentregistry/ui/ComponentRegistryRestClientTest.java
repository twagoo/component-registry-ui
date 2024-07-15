package eu.clarin.cmdi.componentregistry.ui;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.model.BaseDescription;
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
                .defaultHeaders(h -> h.add("Accept", "application/json"))
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
                .uri("items/clarin.eu:cr1:p_1361876010587")
                .header("Accept", "application/json")
                .retrieve();
        
       // log.info("Profile: {}", response.body(String.class));

//        ResponseEntity<List<ProfileDescription>> profiles= response.toEntity(new ParameterizedTypeReference<List<ProfileDescription>>() {
//        });
//        log.info("Profiles: {}", profiles);
        ResponseEntity<BaseDescription> profile = response.toEntity(BaseDescription.class);
        log.info("Description: {}", profile);
    }
}
