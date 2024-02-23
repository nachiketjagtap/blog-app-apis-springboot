package com.nachiket.blog.services;

import java.util.List;

import com.nachiket.blog.payloads.UserDto;

public interface UserService {
	UserDto craeteUser(UserDto user); 
	
	UserDto updateUser(UserDto user, Integer id);
	
	UserDto getUserById(Integer id);
	
	List<UserDto> getllUsers();
	
	void deleteUser(Integer UserId);
	
	
	
	
		
	

}
