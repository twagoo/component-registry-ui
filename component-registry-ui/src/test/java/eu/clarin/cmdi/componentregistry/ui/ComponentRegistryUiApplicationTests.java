package eu.clarin.cmdi.componentregistry.ui;

import eu.clarin.cmdi.componentregistry.ui.web.controller.ComponentBrowserController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentRegistryUiApplicationTests {

    @Autowired
    private ComponentBrowserController browserController;

    @Test
    void contextLoads() {
        assertThat(browserController).isNotNull();
    }

}
