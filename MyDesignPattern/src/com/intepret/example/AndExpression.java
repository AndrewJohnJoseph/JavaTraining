package com.intepret.example;

public class AndExpression implements Expression {
	private Expression expression1;
	 private Expression expression2;
	 
	 public AndExpression(Expression expression1, Expression expression2) {
	     this.expression1 = expression1;
	     this.expression2 = expression2;
	 }
	 
	 public boolean interpret(Employee9 employee) {
	     return expression1.interpret(employee) && expression2.interpret(employee);
	 }

}
