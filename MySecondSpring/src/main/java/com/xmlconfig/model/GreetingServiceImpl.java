package com.xmlconfig.model;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;

	public String getGreeting() {
		return greeting;
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
