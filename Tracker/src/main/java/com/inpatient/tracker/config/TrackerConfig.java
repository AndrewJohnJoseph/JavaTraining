package com.inpatient.tracker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.inpatient.tracker.login.service.TrackerAuthProvider;

@Configuration
@EnableWebSecurity(debug = true)
public class TrackerConfig {
	@Autowired
	TrackerAuthProvider trackerAuthProvider;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.requestMatchers("/login/**").authenticated()
		.requestMatchers("/doctor/**").authenticated()
		.requestMatchers("/admission/**").authenticated()
		.requestMatchers("/location/**").authenticated()
		.requestMatchers("/Patient/**").authenticated()
		.requestMatchers("/v2/api-docs",
			"/v3/api-docs/**",
			"/swagger-resources/configuration/ui",  
			"/swagger-resources/configuration/security", 
			"/webjars/**",
			"/swagger-ui.html","/swagger-ui/**").permitAll();
		
		
		http.httpBasic();
		http.csrf().disable();
		return http.build();
	}
	
	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception {

		AuthenticationManagerBuilder authenticationManagerBuilder = http
				.getSharedObject(AuthenticationManagerBuilder.class);
		authenticationManagerBuilder.authenticationProvider(trackerAuthProvider);
		return authenticationManagerBuilder.build();
	}
}
