package com.inpatient.tracker.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inpatient.tracker.login.entity.LoginEntity;
import com.inpatient.tracker.login.repo.ILoginRepo;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	ILoginRepo loginRepo;
	
	@Override
	public LoginEntity addLogin(LoginEntity login) {
		return loginRepo.save(login);
	}

	@Override
	public List<LoginEntity> getAllLogins() {
		return (List<LoginEntity>)loginRepo.findAll();
	}

	@Override
	public Optional<LoginEntity> getLoginById(long id) {
		return loginRepo.findById(id);
	}

	@Override
	public LoginEntity getLoginByName(String name) {
		return loginRepo.findByLoginName(name);
	}

	@Override
	public LoginEntity putLoginById(long id, LoginEntity login) {
		LoginEntity lgActual = this.getLoginById(id).get();
		lgActual.setForename(login.getForename());
		lgActual.setSurname(login.getSurname());
		lgActual.setGender(login.getGender());
		lgActual.setLoginName(login.getLoginName());
		lgActual.setRoles(login.getRoles());
		return loginRepo.save(lgActual);
	}
	
	@Override
	public void deleteLoginById(long id) {
		loginRepo.deleteById(id);
		
	}

}
