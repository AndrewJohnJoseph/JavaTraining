package com.visitor.example;

public interface Employee12Visitor {
	void visit(Clerk12 clerk);
    void visit(Manager12 manager);
    void visit(Director12 director);
}
