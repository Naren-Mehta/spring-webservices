package com.justlearn.rest.webservices.restfulwebservices.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.justlearn.rest.webservices.restfulwebservices.bean.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String sayHello() {
		return "Hello World ";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping("/hello-world-bean/path-variable/{userId}")
	public HelloWorldBean helloWorldBeanWithParam(@PathVariable Integer userId) {
		return new HelloWorldBean("Hello World Bean and userId= "+userId);
	}
}
