package com.microservicetwo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan("com.microservicetwo.*")
@SpringBootApplication
public class MicroserviceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTwoApplication.class, args);
	}	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder bulBuilder) {
		return bulBuilder.build();
	}	
	
}
