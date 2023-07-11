package com.beyond.leoapiclient;

import com.beyond.leoapiclient.client.LeoApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("leoapi.client")
@Data
@ComponentScan
public class LeoApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public LeoApiClient leoApiClient(){
        return new LeoApiClient(accessKey,secretKey);
    }
}
