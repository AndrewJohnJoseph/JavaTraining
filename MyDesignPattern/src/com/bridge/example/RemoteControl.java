package com.bridge.example;

public class RemoteControl extends Abstraction{
	
	public RemoteControl(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void turnOn() {
		System.out.print("Using RemoteControl : ");
		implementor.on();
		
	}

	@Override
	public void turnOff() {
		System.out.print("Using RemoteControl : ");
		implementor.off();
		
	}

}
