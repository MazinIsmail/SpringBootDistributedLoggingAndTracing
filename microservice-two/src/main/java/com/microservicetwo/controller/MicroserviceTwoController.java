package com.microservicetwo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicetwo.service.MicroserviceTwoService;

@RestController
@RequestMapping("/microserviceTwo")
public class MicroserviceTwoController {

	@Autowired
	private MicroserviceTwoService microserviceTwoService;

	public static final Logger logger = LoggerFactory.getLogger(MicroserviceTwoController.class);

	@GetMapping(value = "/")
	public void checkLogTrace() {
		microserviceTwoService.checkLogTrace();
	}
	
	@GetMapping("/servicetwo")
	public String callFromMicroserviceOne() {
		return microserviceTwoService.callMicroserviceThree();
	}

}
