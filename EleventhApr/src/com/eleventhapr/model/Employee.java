package com.eleventhapr.model;

public class Employee {
	int id = 10;
	String firstname = "";
	String lastname = "";
	
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Employee(int _id, String _firstname, String _lastname) {
		this.id = _id;
		this.firstname = _firstname;
		this.lastname = _lastname;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public void setId(int id) {
		this.id = id;
	}
}
