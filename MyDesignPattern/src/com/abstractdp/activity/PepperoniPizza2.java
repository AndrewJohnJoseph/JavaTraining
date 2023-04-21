package com.abstractdp.activity;

public class PepperoniPizza2 extends Pizza2 {
	
	PepperoniPizza2(String name, double size) {
		super(name, size);
	}

	@Override
	public void bakePizza() {
		System.out.println("Baking " + name + " Pizza of Size " + size);
		
	}

}
