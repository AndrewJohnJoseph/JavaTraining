package com.inpatient.tracker.login.service;

import java.util.List;
import java.util.Optional;

import com.inpatient.tracker.login.entity.LoginEntity;

public interface LoginService {
	public LoginEntity addLogin(LoginEntity login);
	
	public List<LoginEntity> getAllLogins();
	public Optional<LoginEntity> getLoginById(long id);
	public LoginEntity getLoginByName(String name);
	public LoginEntity putLoginById(long id, LoginEntity login);
	public void deleteLoginById(long id);
}
