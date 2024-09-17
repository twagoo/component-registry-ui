package eu.clarin.cmdi.componentregistry.ui;

import eu.clarin.cmdi.componentregistry.openapi.client.ApiClient;
import eu.clarin.cmdi.componentregistry.openapi.client.ApiException;
import eu.clarin.cmdi.componentregistry.openapi.client.api.RegistryApi;
import eu.clarin.cmdi.componentregistry.openapi.client.model.BaseDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ComponentSpec;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ProfileDescription;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ProfileDescriptionsObject;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

/**
 *
 * @author twagoo
 */
@SpringBootTest
@Slf4j
public class ComponentRegistryRestClientTest {

    public final String serviceUrl = "http://localhost:8080/ds/ComponentRegistry/rest";

    @Test
    public void testRegistryApi() throws ApiException {
        RegistryApi api = new RegistryApi();
        api.getApiClient().setBasePath(serviceUrl);
        api.getApiClient().addDefaultHeader("Accept", "application/json");
        
        {
            ProfileDescriptionsObject profilesObj = api.getRegisteredProfilesObject("1.x", "published", Boolean.FALSE, null, Collections.emptyList(), null);
            assertNotNull(profilesObj);
            List<ProfileDescription> profileDescriptions = profilesObj.getProfileDescriptions();
            assertNotNull(profileDescriptions);
        }

//        {
//            // cmdVersion is not inserted into path variable if we use api.getRegisteredProfile ??
//            final ComponentSpec profile = api.getRegisteredProfile1("1.x", "clarin.eu:cr1:p_1361876010587");
//            assertNotNull(profile);
//        }

//        {
//            final List<ProfileDescription> registeredProfiles = api.getRegisteredProfiles1("1.x", "published", Boolean.FALSE, null, Collections.emptyList(), null);
//            assertNotNull(registeredProfiles);
//        }
    }
//
////    @Test
//    public void testConnect1() {
//
//        RestClient restClient = ApiClient.buildRestClientBuilder().baseUrl(serviceUrl)
//                .defaultHeaders(h -> h.add("Accept", "application/json"))
//                .build();
////
//        {
//            RestClient.ResponseSpec response = restClient.get()
//                    .uri("/items/clarin.eu:cr1:p_1361876010587")
//                    .header("Accept", "application/json")
//                    .retrieve();
//            ResponseEntity<BaseDescription> profile = response.toEntity(BaseDescription.class);
//            log.info("Description: {}", profile);
//        }
//
//        {
//            RestClient.ResponseSpec response = restClient.get()
//                    .uri("/registry/profiles")
//                    .header("Accept", "application/json")
//                    .retrieve();
//            ResponseEntity<List<ProfileDescription>> profiles = response.toEntity(new ParameterizedTypeReference<List<ProfileDescription>>() {
//            });
//            log.info("Profiles: {}", profiles);
//        }
//    }
}
