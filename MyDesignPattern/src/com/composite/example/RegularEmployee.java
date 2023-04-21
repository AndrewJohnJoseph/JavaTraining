package com.composite.example;

import java.util.List;

public class RegularEmployee implements Employee4{
	String name;
	String department;
	double salary;
	
	public RegularEmployee(String na, String dept, double sal) {
		this.name = na;
		this.department = dept;
		this.salary = sal;
	}
	
	@Override
	public void add(Employee4 employee) {
		
	}
	@Override
	public void remove(Employee4 employee) {
		
	}
	@Override
	public List<Employee4> getSubordinates() {
		return null;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getDepartment() {
		return this.department;
	}
	@Override
	public double getSalary() {
		return this.salary;
	}
}
