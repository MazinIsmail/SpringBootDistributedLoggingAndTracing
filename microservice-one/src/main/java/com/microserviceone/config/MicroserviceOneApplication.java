package com.microserviceone.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Spring cloud Sleuth logs structure is as follows
 * [application-name,traceid,spanid,zipkin-export]
 * 
 * Application-name = Name of the application
 * 
 * Traceid = each request and response traceid is same when calling same service
 * or one service to another service.
 * 
 * Spanid = Span Id is printed along with Trace Id. Span Id is different every
 * request and response calling one service to another service.
 * 
 * Zipkin-export = By default it is false. If it is true, logs will be exported
 * to the Zipkin server.
 *
 */
@SpringBootApplication
@ComponentScan("com.microserviceone*")
public class MicroserviceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder bulBuilder) {
		return bulBuilder.build();
	}

}
