package com.hello;

public class HelloPakistan {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Hello Pakistan init method called..");
	}
	public void destroy(){
		System.out.println("Hello Pakistan destroy method called..");
	}
}
