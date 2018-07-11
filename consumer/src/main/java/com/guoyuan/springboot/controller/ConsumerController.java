package com.guoyuan.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	private static final String REST_URL_PREFIX = "http://localhost:8001";
	//private static final String REST_URL_PREFIX = "http://provider-8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer/vi")
	public String consumer(){
		return restTemplate.getForObject(REST_URL_PREFIX + "/provide",String.class);
	}
	
	
	
	
	
}
