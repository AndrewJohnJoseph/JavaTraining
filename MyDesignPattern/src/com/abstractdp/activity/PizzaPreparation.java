package com.abstractdp.activity;

public class PizzaPreparation {
	private PizzaFactory2 pizzafactory2;
	
	public PizzaPreparation(PizzaFactory2 instance) {
		pizzafactory2 = instance;
	}
	
	public void preparePizza(String name, double size) {
		Pizza2 pizza2 = pizzafactory2.preparePizza(name, size);
		pizza2.bakePizza();
	}
}
