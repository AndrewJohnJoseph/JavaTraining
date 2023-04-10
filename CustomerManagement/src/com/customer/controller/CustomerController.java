package com.customer.controller;

import java.util.Scanner;

import com.customer.model.Customer;

public class CustomerController {
	Customer cus = new Customer();
	
	public void addCustomer() {
		//System.out.println(cus.get_id());
		//System.out.println(cus.get_name());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID : ");
		cus.set_id(sc.nextInt());
		System.out.println("Enter Name : ");
		cus.set_name(sc.next());
		//System.out.println(cus.get_id());
		//System.out.println(cus.get_name());
		//System.out.println(cus);
	}
	
	public void viewCustomer() {
		System.out.println(cus);
	}
}
