package com.visitor.example;

public class Manager12 implements Employee12 {
	@Override
    public void accept(Employee12Visitor visitor) {
        visitor.visit(this);
    }
    
    public void doManagerWork() {
        System.out.println("Doing manager work");
    }
}
