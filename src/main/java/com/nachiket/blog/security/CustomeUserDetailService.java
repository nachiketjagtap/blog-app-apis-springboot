package com.nachiket.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nachiket.blog.entities.User;
import com.nachiket.blog.exceptions.ResourceNotFoundException;
import com.nachiket.blog.repositories.UserRepo;


@Service
public class CustomeUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Load user from db by username
		
		User user = this.userRepo.findByEmail(username).orElseThrow(()->new ResourceNotFoundException("User", "email : "+username, 0));
		
		
		return user;
		
		
		
	}

}
