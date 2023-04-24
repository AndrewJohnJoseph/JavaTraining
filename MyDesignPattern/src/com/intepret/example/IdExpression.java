package com.intepret.example;

public class IdExpression implements Expression {
	private int id;
	 
	 public IdExpression(int id) {
	     this.id = id;
	 }
	 
	 public boolean interpret(Employee9 employee) {
	     return employee.getId() == id;
	 }

}
