package com.chainofresp.example;

public class Supervisor extends Employee7{

	@Override
	protected boolean canHandleRequest(Request request) {
		return request.getType() == RequestType.LEAVE && request.getDays() <= 3;
	}

	@Override
	protected void handleRequest(Request request) {
		System.out.println("Supervisor approved a " + request.getType() + " request for " + request.getDays() + " days.");
	}

}
