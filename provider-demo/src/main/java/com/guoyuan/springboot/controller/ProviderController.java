package com.guoyuan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	@RequestMapping(value="/provide",method=RequestMethod.GET)
	public String getRepsonse(){
		return "watching video .....";
	}
}
