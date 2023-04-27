package com.firstspring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		HelloWorld hw = new HelloWorld();
		HelloWorld hw = (HelloWorld) context.getBean("obj");
		System.out.println(hw.getStatus());

	}

}
