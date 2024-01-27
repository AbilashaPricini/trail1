package com.in28minutes.microservices.limitservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.microservices.limitservice.configuration.Configuration;

import com.in28minutes.microservices.limitservice.bean.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		//return new Limits(1, 1000);
		
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
