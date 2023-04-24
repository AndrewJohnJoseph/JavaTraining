package com.chainofresp.example;

public abstract class Employee7 {
	private Employee7 nextEmployee;

	public void setNextEmployee(Employee7 nextEmployee) {
		this.nextEmployee = nextEmployee;
	}

	public void processRequest(Request request) {
		if (canHandleRequest(request)) {
			handleRequest(request);
		} else if (nextEmployee != null) {
			nextEmployee.processRequest(request);
		}
	}

	protected abstract boolean canHandleRequest(Request request);

	protected abstract void handleRequest(Request request);
}
