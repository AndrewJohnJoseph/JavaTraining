package com.thirdspring.MyThirdSpring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.thirdspring.MyThirdSpring.entity.MyTraveller;
import com.thirdspring.MyThirdSpring.repo.*;

@Service
public class TravellerAuthProvider implements AuthenticationProvider {
	
	@Autowired
	ITravellerRepo travellerRepo;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		//String pwd = new BCryptPasswordEncoder(1).encode(authentication.getCredentials().toString());
		String pwd = authentication.getCredentials().toString();
		System.out.println(username + " - " + pwd);
		MyTraveller mytraveller = travellerRepo.findBytravellerName(username);
		
		if (mytraveller == null) {
			throw new StackOverflowError("No user got registered");
		} else if (pwd.equals(mytraveller.getTravellerPwd())) {
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(mytraveller.getRoles()));
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
