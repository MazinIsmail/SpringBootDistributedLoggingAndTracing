package com.microserviceone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceone.service.MicroserviceOneService;

@RestController
@RequestMapping("/microserviceOne")
public class MicroserviceOneController {

	@Autowired
	private MicroserviceOneService microserviceOneService;

	public static final Logger logger = LoggerFactory.getLogger(MicroserviceOneController.class);

	@GetMapping(value = "/")
	public void checkLogTrace() {
		microserviceOneService.checkLogTrace();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return microserviceOneService.checkLogTrace();
	}

}
