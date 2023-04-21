package com.abstractdp.activity;

public class VeggiePizza2 extends Pizza2 {
	
	VeggiePizza2(String name, double size) {
		super(name, size);
	}
	
	@Override
	public void bakePizza() {
		System.out.println("Baking " + name + " Pizza of Size " + size);
		
	}
}
