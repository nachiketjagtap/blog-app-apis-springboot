package com.nachiket.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nachiket.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {
	

}
