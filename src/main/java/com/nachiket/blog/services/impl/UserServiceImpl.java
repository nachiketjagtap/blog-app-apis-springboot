package com.nachiket.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nachiket.blog.entities.User;
import com.nachiket.blog.payloads.UserDto;
import com.nachiket.blog.repositories.UserRepo;
import com.nachiket.blog.services.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto craeteUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = this.dtoToUser(userDto);
		
		User savedUser = this.userRepo.save(user);
		
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer UserId) {
		// TODO Auto-generated method stub

	}
	public User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getName());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
		
	}
	
	public UserDto userToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName()); 
		userDto.setEmail(user.getName());
		userDto.setAbout(user.getName());
		userDto.setPassword(user.getPassword());
		
		return userDto;
		
	}
	

}
