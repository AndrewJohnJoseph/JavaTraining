package com.eleventhapr.model;

public interface EmployeeDao {
	public void insertEmployee(Employee emp);
	public void getEmployee(int id);
	public void getEmployees();
	public void updateEmployee(Employee emp);
	public void deteleEmployee(int id);
}
