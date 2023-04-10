package com.april.models;

public class EmployeeDetails {
	int uid;
	String name;
	String gender;
	
	EmployeeDetails() {
		super();
	}
	
	public EmployeeDetails(int _id, String _name, String _gender) {
		this.uid = _id;
		this.name = _name;
		this.gender = _gender;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [uid=" + uid + ", name=" + name + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
