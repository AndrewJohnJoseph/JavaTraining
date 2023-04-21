package com.abstractdp.activity;

abstract class Pizza2 {
	protected String name;
	protected double size;

	public Pizza2(String name, double size) {
		this.name = name;
		this.size = size;
	}

	public abstract void bakePizza();
}
