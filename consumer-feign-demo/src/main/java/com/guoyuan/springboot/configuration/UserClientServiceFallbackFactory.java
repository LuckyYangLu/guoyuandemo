package com.guoyuan.springboot.configuration;

import org.springframework.stereotype.Component;

import com.guoyuan.springboot.service.UserClientService;

import feign.hystrix.FallbackFactory;
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService>{

	@Override
	public UserClientService create(Throwable arg0) {
		return new UserClientService(){

			@Override
			public String getRepsonse() {
				return "service has shutted down,please wait!";
			}
			
		};
	}

}
