package com.adapter.example;

public class Employee3 {
	private String firstName;
	private String lastName;
	private int Age;
	
	public Employee3(String fn, String ln, int a) {
		this.firstName = fn;
		this.lastName = ln;
		this.Age = a;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.Age;
	}
}
