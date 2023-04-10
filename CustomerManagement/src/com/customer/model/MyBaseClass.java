package com.customer.model;

//public class MyBaseClass extends FinalClass {
public abstract class MyBaseClass implements IVehicle {
	final int age = 10;
	static String gender = "male";
	public int getAge() {
		return age;
	}
	
	public String getDefaultGender() {
		return "female";
	}
	
	public abstract String getGender();
	
	public String getVehicleNo() {
		//this.vehicleNo = "TN02BJ9286";
		return this.vehicleNo;
	}
}
