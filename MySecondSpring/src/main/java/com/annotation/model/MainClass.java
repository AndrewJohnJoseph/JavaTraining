package com.annotation.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
		GreetingService gs1 = (GreetingService) context.getBean("greetingServiceImpl");
		gs1.getStatus();

	}

}
