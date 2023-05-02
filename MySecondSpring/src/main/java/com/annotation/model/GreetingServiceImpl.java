package com.annotation.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GreetingServiceImpl implements GreetingService {
	@Value("John")
	private String greeting;

	public String getGreeting() {
		return greeting;
	}
	

	public GreetingServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GreetingServiceImpl(String greeting) {
		super();
		this.greeting = greeting;
	}


	@Override
	public String toString() {
		return "GreetingServiceImpl [greeting=" + greeting + "]";
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	@Override
	public void getStatus() {
		System.out.println("Hi " + this.greeting);
		
	}
}
