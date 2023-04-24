package com.state.example;

public class OffState implements State {
	@Override
    public void switchOn(LightSwitch lightSwitch) {
        System.out.println("Switching light on");
        lightSwitch.setState(new OnState());
    }
    
    @Override
    public void switchOff(LightSwitch lightSwitch) {
        System.out.println("Light is already off");
    }
}
