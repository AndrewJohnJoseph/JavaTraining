package com.customer.model;

public class CustomerDetails extends MyBaseClass {
	private long phoneNo = 123;
	private String address = "Chennai-600050";
	
	public CustomerDetails() {
		System.out.println("CustomerDetails constructor");
	}
	
	public CustomerDetails(long phoneNo, String address) {
		this("Andrew John Joseph");
		this.phoneNo = phoneNo;
		//this.address = address;
		
	}
	
	private CustomerDetails(String temp) {
		this.address = temp;
	}

	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void assignAddress() {
		System.out.println("assignAddress");
	}
	
	public final int getAge() {
		return 20;
	}
	
	public String getGender() {
		return "male";
	}
	
	public String getDetails() {
		return "CustomerDetails [phoneNo=" + phoneNo + ", address=" + address + "]";
		//return super.toString();
		
	}
	@Override
	public String toString() {
		return "CustomerDetails [phoneNo=" + phoneNo + ", address=" + address + "]";
	}
}
 