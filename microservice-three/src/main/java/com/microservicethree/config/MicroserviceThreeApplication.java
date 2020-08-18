package com.microservicethree.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.microservicethree*")
public class MicroserviceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceThreeApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder bulBuilder) {
		return bulBuilder.build();
	}	

}
