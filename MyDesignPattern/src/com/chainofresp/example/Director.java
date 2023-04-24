package com.chainofresp.example;

public class Director extends Employee7 {
	@Override
	protected boolean canHandleRequest(Request request) {
		return request.getType() == RequestType.LEAVE && request.getDays() <= 30;
	}

	@Override
	protected void handleRequest(Request request) {
		System.out.println("Director approved a " + request.getType() + " request for " + request.getDays() + " days.");
	}
}
