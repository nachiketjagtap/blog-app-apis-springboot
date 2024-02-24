package com.nachiket.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.nachiket.blog.exceptions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nachiket.blog.entities.User;
import com.nachiket.blog.payloads.UserDto;
import com.nachiket.blog.repositories.UserRepo;
import com.nachiket.blog.services.UserService;
@Service
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
	public UserDto updateUser(UserDto userDto, Integer id) {
		// TODO Auto-generated method stub
		User user = this.userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User"," id ",id));
		
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		User updatedUser=this.userRepo.save(user);
		
		UserDto userDto1=this.userToDto(updatedUser);
		
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = this.userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User"," id ",id));
		
		
		return this.userToDto(user);
	}

	@Override
	public List<UserDto> getllUsers() {
		// TODO Auto-generated method stub
		
		List<User> users = this.userRepo.findAll();
		List<UserDto> userDtos = users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		
		return userDtos;
	}

	@Override
	public void deleteUser(Integer UserId) {
		
		User user = this.userRepo.findById(UserId).orElseThrow(()->new ResourceNotFoundException("User"," id ",UserId));
		this.userRepo.delete(user);
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
