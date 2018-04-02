package gr.codehub.example.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "gr.codehub.example.controller")
public class WebCoreConfiguration {

    public WebCoreConfiguration() {
        System.out.println();
    }

}
