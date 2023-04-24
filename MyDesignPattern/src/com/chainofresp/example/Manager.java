package com.chainofresp.example;

public class Manager extends Employee7 {
	@Override
	protected boolean canHandleRequest(Request request) {
		return request.getType() == RequestType.LEAVE && request.getDays() <= 10;
	}

	@Override
	protected void handleRequest(Request request) {
		System.out.println("Manager approved a " + request.getType() + " request for " + request.getDays() + " days.");
	}
}
