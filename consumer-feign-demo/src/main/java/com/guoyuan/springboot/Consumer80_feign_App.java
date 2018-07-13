package com.guoyuan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@EnableFeignClients(basePackages= {"com.guoyuan.springboot"})
@ComponentScan("com.guoyuan.springboot")
public class Consumer80_feign_App{
	public static void main(String[] args){
		SpringApplication.run(Consumer80_feign_App.class, args);
	}
}
