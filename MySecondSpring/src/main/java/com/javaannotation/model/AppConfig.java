package com.javaannotation.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name = "gs1")
	public GreetingServiceImpl getGs1() {
		GreetingServiceImpl gs = new GreetingServiceImpl();
		gs.setGreeting("Good Evening");
		return gs;
	}
	
	@Bean(name = "gs2")
	//@Scope("singleton")
	@Scope("prototype")
	public GreetingServiceImpl getGs2() {
		GreetingServiceImpl gs = new GreetingServiceImpl("Good Night");
		return gs;
	}
}
