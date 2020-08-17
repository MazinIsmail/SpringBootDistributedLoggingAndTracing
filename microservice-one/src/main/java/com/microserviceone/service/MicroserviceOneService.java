package com.microserviceone.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MicroserviceOneService {

	public static final Logger logger = LoggerFactory.getLogger(MicroserviceOneService.class);

	@Autowired
	private RestTemplate restTemplate;

	public void checkLogTrace() {
		logger.debug("Start :: checkLogTrace");

		logger.trace("Trace :: checkLogTrace");
		logger.info("Info :: checkLogTrace");
		logger.debug("Debug :: checkLogTrace");
		logger.warn("Warn :: checkLogTrace");
		logger.error("Error :: checkLogTrace");

		callMicroserviceTwo();
		logger.debug("End :: checkLogTrace");
	}

	public void callMicroserviceTwo() {
		
		
	}

}
