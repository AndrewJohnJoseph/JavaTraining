package com.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Manager4 implements Employee4 {
	private String name;
	private String department;
	private double salary;
	private List<Employee4> subordinates;
	
	public Manager4(String na, String dept, double sal) {
		this.name = na;
		this.department = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee4>();
	}

	@Override
	public void add(Employee4 employee) {
		subordinates.add(employee);
		
	}

	@Override
	public void remove(Employee4 employee) {
		subordinates.remove(employee);
		
	}

	@Override
	public List<Employee4> getSubordinates() {
		return subordinates;
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
		double totalSalary = salary;
		for (Employee4 subordinate : subordinates) {
			totalSalary += subordinate.getSalary();
		}
		return totalSalary;
	}
}
