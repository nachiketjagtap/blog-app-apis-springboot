package com.nachiket.blog.services;

import java.util.List;

import com.nachiket.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser (UserDto user);
	UserDto craeteUser(UserDto user); 
	
	UserDto updateUser(UserDto user, Integer id);
	
	UserDto getUserById(Integer id);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer UserId);
	
	
	
	
		
	

}
