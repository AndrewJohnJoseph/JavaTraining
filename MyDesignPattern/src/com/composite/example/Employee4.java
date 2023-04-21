package com.composite.example;

import java.util.List;

public interface Employee4 {
	public void add(Employee4 employee);
    public void remove(Employee4 employee);
    public List<Employee4> getSubordinates();
    public String getName();
    public String getDepartment();
    public double getSalary();
}
