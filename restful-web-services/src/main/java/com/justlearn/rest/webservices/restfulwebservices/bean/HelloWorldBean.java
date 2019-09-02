package com.justlearn.rest.webservices.restfulwebservices.bean;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String name) {
		this.message = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
