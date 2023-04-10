package com.employee.models;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Serializable, Comparable <Employee>{
	private int id = 0;
	private String name = "";
	
	public Employee(int _id, String nm) {
		setId(_id);
		setName(nm);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
}
