package com.guoyuan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@EnableEurekaClient
public class Consumer80_App{
	public static void main(String[] args){
		SpringApplication.run(Consumer80_App.class, args);
	}
}