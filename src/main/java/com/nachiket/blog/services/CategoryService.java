package com.nachiket.blog.services;

import com.nachiket.blog.payloads.CategoryDto;
import java.util.*;



public interface CategoryService {
	//create
	 CategoryDto createCategory(CategoryDto categoryDto);
		
	
	
	//update
	 CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	
	//delete
	 void deleteCategory(Integer categoryId);

	
	//get
	 CategoryDto getCategory(Integer categoryId);

	
	
	//getall
	 
	List<CategoryDto> getCategories();

}
