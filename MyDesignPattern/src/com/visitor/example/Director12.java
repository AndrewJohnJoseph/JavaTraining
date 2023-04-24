package com.visitor.example;

public class Director12 implements Employee12 {
	@Override
    public void accept(Employee12Visitor visitor) {
        visitor.visit(this);
    }
    
    public void doDirectorWork() {
        System.out.println("Doing director work");
    }
}
