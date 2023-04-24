package com.template.example;

abstract class Beverage {
	public final void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	protected void boilWater() {
		System.out.println("Boiling water...");
	}

	// This is an abstract method that subclasses must implement to brew the
	// specific type of beverage
	protected abstract void brew();

	protected void pourInCup() {
		System.out.println("Pouring beverage into cup...");
	}

	// This is a hook that subclasses can override to provide additional
	// functionality
	protected void addCondiments() {
	}
}
