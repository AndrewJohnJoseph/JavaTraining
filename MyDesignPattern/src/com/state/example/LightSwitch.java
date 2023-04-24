package com.state.example;

public class LightSwitch {
	private State state;
    
    public LightSwitch() {
        state = new OffState();
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void switchOn() {
        state.switchOn(this);
    }
    
    public void switchOff() {
        state.switchOff(this);
    }

}
