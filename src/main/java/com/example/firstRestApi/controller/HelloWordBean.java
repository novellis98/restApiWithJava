package com.example.firstRestApi.controller;

public class HelloWordBean {
private String message;
	public HelloWordBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "HelloWordBean [message=" + message + "]";
	}

}
