package com.factory.example;

public class PizzaFactory {
	public Pizza getPizza(String pizzaType) {
		if (pizzaType == null) {
			return null;
		}
		if (pizzaType.equalsIgnoreCase("PepperoniPizza")) {
			return new PepperoniPizza();
		} else if (pizzaType.equalsIgnoreCase("VeggiePizza")) {
			return new VeggiePizza();
		} else if (pizzaType.equalsIgnoreCase("CheesePizza")) {
			return new CheesePizza();
		}
		return null;
	}
}
