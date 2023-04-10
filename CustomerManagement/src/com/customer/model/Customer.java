package com.customer.model;

public class Customer extends CustomerDetails {
	private int _id = 1;
	private String _name = "Andrew";
	
	public Customer() {
		super(123446, "Tirunelveli");
		System.out.println("Customer constructor");
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	
	public String getDetails() {
		return "Customer [_id=" + _id + ", _name=" + _name + "]" +  super.getDetails();
	}
	
	//public int getAge() {
		//return 30;
	//}
	
	public void assignvalue() {
		System.out.println("assignvalue");
	}
	
	@Override
	public String toString() {
		return "Customer [_id=" + _id + ", _name=" + _name + "]";
	}
	
}
