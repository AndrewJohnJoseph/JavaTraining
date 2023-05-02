package com.javaannotation.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		GreetingService gs1 = (GreetingService) context.getBean("gs1");
//		gs1.getStatus();
		
		GreetingService gs2 = (GreetingService) context.getBean("gs2");
		gs2.getStatus();
		
		GreetingService gs3 = (GreetingService) context.getBean("gs2");
		gs3.getStatus();
		
		GreetingService gs4 = (GreetingService) context.getBean("gs2");
		gs4.getStatus();

		System.out.println(gs2.hashCode());
		System.out.println(gs3.hashCode());
		System.out.println(gs4.hashCode());
	}

}
