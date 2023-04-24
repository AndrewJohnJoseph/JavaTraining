package com.mediator.example;

import java.util.Date;

public class CustomerCare {
	public static void sendMessage(Customer user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
