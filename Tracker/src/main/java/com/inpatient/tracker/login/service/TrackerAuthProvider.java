package com.inpatient.tracker.login.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.inpatient.tracker.login.entity.LoginEntity;
import com.inpatient.tracker.login.repo.ILoginRepo;

@Service
public class TrackerAuthProvider  implements AuthenticationProvider {
	
	@Autowired
	ILoginRepo loginRepo;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		System.out.println(username + " - " + pwd);
		LoginEntity mylogin = loginRepo.findByLoginName(username);
		
		if (mylogin == null) {
			throw new StackOverflowError("No user got registered");
		} else if (pwd.equals(mylogin.getPassword())) {
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(mylogin.getRoles()));
			return new UsernamePasswordAuthenticationToken(username, pwd, authorities);
		} else {
			System.out.println("I am a bad credentails");
			throw new StackOverflowError("Invalid Password");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
