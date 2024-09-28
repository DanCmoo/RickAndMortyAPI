package org.example.rickandmorty.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
