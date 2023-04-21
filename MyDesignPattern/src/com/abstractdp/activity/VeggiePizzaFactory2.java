package com.abstractdp.activity;

public class VeggiePizzaFactory2 implements PizzaFactory2 {

	@Override
	public Pizza2 preparePizza(String name, double size) {
		return new VeggiePizza2(name, size);
	}

}
