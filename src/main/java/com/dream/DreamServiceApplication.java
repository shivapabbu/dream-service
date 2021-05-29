package com.dream;

import ch.qos.logback.classic.Logger;
import com.dream.model.CrickInfo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class DreamServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(DreamServiceApplication.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            CrickInfo crickInfo = restTemplate.getForObject(
//                    "https://hs-consumer-api.espncricinfo.com/v1/pages/matches/current?latest=true", CrickInfo.class);
//
//
//        };
//    }

}
