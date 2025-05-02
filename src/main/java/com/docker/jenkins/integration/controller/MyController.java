package com.docker.jenkins.integration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	Logger log = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/message")
	public String getMessage() {
		log.info("------------------------------------");
		return "Hi there..!";
	}
	
	
	
}
