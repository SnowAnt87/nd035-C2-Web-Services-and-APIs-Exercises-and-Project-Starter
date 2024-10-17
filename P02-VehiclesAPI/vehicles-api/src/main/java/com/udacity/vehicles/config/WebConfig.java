package com.udacity.vehicles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Redirect the old Swagger 2 URL to the OpenAPI 3 UI URL
        registry.addRedirectViewController("/swagger-ui.html", "/swagger-ui/index.html");
        // This ensures if you navigate to swagger-ui.html, it directs to the correct path
    }
}
