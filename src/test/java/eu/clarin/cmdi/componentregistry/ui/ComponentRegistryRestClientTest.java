package eu.clarin.cmdi.componentregistry.ui;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestClient;

/**
 *
 * @author twagoo
 */
@SpringBootTest
@Slf4j
public class ComponentRegistryRestClientTest {

    @Autowired
    private Jaxb2RootElementHttpMessageConverter xmlConverter;
    @Autowired
    private MappingJackson2HttpMessageConverter jsonConverter;

    public final String serviceUrl = "http://localhost:8080/ds/ComponentRegistry/rest/";

    @Test
    public void testConnect() {
        RestClient client = RestClient.builder()
                .requestFactory(new HttpComponentsClientHttpRequestFactory())
                //.messageConverters(converters -> converters.add(new MyCustomMessageConverter()))
                .baseUrl(serviceUrl)
                //.defaultUriVariables(Map.of("variable", "foo"))
                //.defaultHeader("My-Header", "Foo")
                //.requestInterceptor(myCustomInterceptor)
                //.requestInitializer(myCustomInitializer)
                .messageConverters(list -> {
                    list.add(xmlConverter);
                    list.add(jsonConverter);
                })
                .build();

        RestClient.ResponseSpec response = client.get()
                .uri("registry/profiles/clarin.eu:cr1:p_1361876010587")
                .retrieve();
        
//        ResponseEntity<List<ProfileDescription>> profiles= response.toEntity(new ParameterizedTypeReference<List<ProfileDescription>>() {
//        });
//        log.info("Profiles: {}", profiles);

//        ResponseEntity<ProfileDescription> profile = response.toEntity(ProfileDescription.class);

//        log.info("Profile: {}", profile);
    }
}
