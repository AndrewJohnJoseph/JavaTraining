package com.mediator.example;

public class Customer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		CustomerCare.sendMessage(this, message);
	}
}
