package com.guoyuan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ProviderController {
	@RequestMapping(value="/provide",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="processHytrixFallBack")
	public String getRepsonse(){
		return "watching video .....";
	}
	
	public String processHytrixFallBack(){
		return "The service has occured something wrong, please wait!";
	}
	
	
}
