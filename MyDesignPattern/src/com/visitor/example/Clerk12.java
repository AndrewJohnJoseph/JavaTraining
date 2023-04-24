package com.visitor.example;

public class Clerk12 implements Employee12 {
	@Override
    public void accept(Employee12Visitor visitor) {
        visitor.visit(this);
    }
    
    public void doClerkWork() {
        System.out.println("Doing clerk work");
    }
}
