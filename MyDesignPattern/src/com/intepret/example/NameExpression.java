package com.intepret.example;

public class NameExpression implements Expression {
	private String name;
	 
	 public NameExpression(String name) {
	     this.name = name;
	 }
	 
	 public boolean interpret(Employee9 employee) {
	     return employee.getName().equalsIgnoreCase(name);
	 }

}
