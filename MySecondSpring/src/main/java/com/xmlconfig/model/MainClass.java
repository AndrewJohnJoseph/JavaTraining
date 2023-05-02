package com.xmlconfig.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("XMLConfig.xml");
		GreetingService gs1 = (GreetingService) context.getBean("greetingservice");
		gs1.getStatus();

	}

}
