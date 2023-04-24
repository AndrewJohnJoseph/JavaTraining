package com.visitor.example;

public class BonusVisitor implements Employee12Visitor {
	@Override
    public void visit(Clerk12 clerk) {
        System.out.println("Clerk gets a bonus of 1000 dollars");
    }
    
    @Override
    public void visit(Manager12 manager) {
        System.out.println("Manager gets a bonus of 5000 dollars");
    }
    
    @Override
    public void visit(Director12 director) {
        System.out.println("Director gets a bonus of 10000 dollars");
    }
}
