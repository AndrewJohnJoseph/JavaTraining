package com.bridge.example;

public abstract class Abstraction {
	protected Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public abstract void turnOn();

	public abstract void turnOff();

}
