package com.abstractdp.activity;

public class PepperoniPizzaFactory2 implements PizzaFactory2{

	@Override
	public Pizza2 preparePizza(String name, double size) {
		// TODO Auto-generated method stub
		return new PepperoniPizza2(name, size);
	}

}
