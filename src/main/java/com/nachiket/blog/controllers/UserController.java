package com.nachiket.blog.controllers;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nachiket.blog.payloads.ApiResponse;
import com.nachiket.blog.payloads.UserDto;
import com.nachiket.blog.services.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	//POST - create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
		UserDto createUserDto = this.userService.craeteUser(userDto);
		return  new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
		
	}
	//PUT -update user
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable("id")Integer id){
		UserDto  updatedUser = this.userService.updateUser(userDto, id);
		return ResponseEntity.ok(updatedUser);
		
		
	}
	
	//DELETE = delete user
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("id")Integer id){
		this.userService.deleteUser(id);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully..!",true),HttpStatus.OK);
		
	}
	
	
	//GET - get user
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		return ResponseEntity.ok(this.userService.getAllUsers());
		
	}
	
	//GET - get user
		@GetMapping("/{id}")
		public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer id){
			return ResponseEntity.ok(this.userService.getUserById(id));
			
		}
}
