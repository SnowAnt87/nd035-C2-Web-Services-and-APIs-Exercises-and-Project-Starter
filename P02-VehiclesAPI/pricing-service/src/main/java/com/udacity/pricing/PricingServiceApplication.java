package com.udacity.pricing;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}





