package com.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		HelloPakistan obj = (HelloPakistan) context.getBean("helloPakistan");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
