package com.dal;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dal.model.Customer;




public class MainClass {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		HelloWorld hw = new HelloWorld();
//		HelloWorld hw = (HelloWorld) context.getBean("obj");
//		hw.setStatus("Hi Andrew...");
		
//		User objUsr = (User) context.getBean("objUser");
//		System.out.println(objUsr.getUserName() + " has " + objUsr.getCar().getName() + " " + objUsr.getCar().getModel());
		
		Customer objCustomer = (Customer) context.getBean("customer");
		System.out.println(objCustomer.getUserName() + " has " + objCustomer.getCar().getName() + " " + objCustomer.getCar().getModel());

	}

}
