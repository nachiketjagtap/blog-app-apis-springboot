package com.nachiket.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nachiket.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
