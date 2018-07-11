package com.guoyuan.springboot.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 实现feign接口调用服务
 * @author Lu
 *
 */
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER-8001")
public interface UserClientService {
	
	@RequestMapping(value = "/provide", method = RequestMethod.GET)
	public String getRepsonse();
	

}
