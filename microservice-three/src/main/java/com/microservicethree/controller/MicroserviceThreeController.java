package com.microservicethree.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicethree.service.MicroserviceThreeService;

@RestController
@RequestMapping("/microserviceOne")
public class MicroserviceThreeController {

	@Autowired
	private MicroserviceThreeService microserviceThreeService;

	public static final Logger logger = LoggerFactory.getLogger(MicroserviceThreeController.class);

	@GetMapping(value = "/")
	public void checkLogTrace() {
		microserviceThreeService.checkLogTrace();
	}

}
