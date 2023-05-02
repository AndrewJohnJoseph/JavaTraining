package com.dal.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Customer {
	@Value("John")
	private String userName;
	
	@Autowired
	private Car car;
	
	public Customer() {
		super();
	}
	
	public Customer(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("From User Class Setter for UserName");
		this.userName = userName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", car=" + car + "]";
	}
	
}
