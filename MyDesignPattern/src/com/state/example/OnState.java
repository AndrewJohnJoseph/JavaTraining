package com.state.example;

public class OnState implements State {

	@Override
	public void switchOn(LightSwitch lightSwitch) {
		System.out.println("Light is already on");
		
	}

	@Override
	public void switchOff(LightSwitch lightSwitch) {
		System.out.println("Switching light off");
        lightSwitch.setState(new OffState());
	}

}
