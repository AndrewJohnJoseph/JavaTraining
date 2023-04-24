package com.template.example;

public class Coffee extends Beverage {
	@Override
	protected void brew() {
		System.out.println("Brewing coffee...");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding sugar and milk...");
	}
}
