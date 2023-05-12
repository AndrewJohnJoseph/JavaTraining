package com.inpatient.tracker.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inpatient.tracker.login.entity.LoginEntity;
import com.inpatient.tracker.login.service.LoginService;


@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@PreAuthorize("hasAuthority('admin')")
	@PostMapping("/login")
	public LoginEntity postLogin(@RequestBody LoginEntity login) {
		return loginService.addLogin(login);
	}
	
	@GetMapping("/login")
	public List<LoginEntity> getLogins() {
		return loginService.getAllLogins();
	}
	
	@GetMapping("/login/{id}")
	public Optional<LoginEntity> getLoginById(@PathVariable Long id) {
		System.out.println(id);
		return loginService.getLoginById(id);
	}
	
	@GetMapping("/login/query")
	public LoginEntity getLoginByName(@RequestParam(value = "loginName", required = false) String name) {
		return loginService.getLoginByName(name);
	}
	
	@PreAuthorize("hasAuthority('admin')")
	@PutMapping("/login/{id}")
	public void putLoginById(@PathVariable Long id, @RequestBody LoginEntity login) {
		loginService.putLoginById(id, login);
	}
	
	@DeleteMapping("/login/{id}")
	public void deleteLoginById(@PathVariable Long id) {
		loginService.deleteLoginById(id);
	}
}
