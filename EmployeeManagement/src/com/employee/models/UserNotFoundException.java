package com.employee.models;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		System.out.println("User is not available");
	}
}
