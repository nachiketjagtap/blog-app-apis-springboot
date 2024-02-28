package com.nachiket.blog.services;

import com.nachiket.blog.payloads.CategoryDto;
import java.util.*;
public interface CategoryService {
	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
		
	
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	
	//delete
	public void deleteCategory(Integer categoryId);

	
	//get
	public CategoryDto getCategory(Integer categoryId);

	
	
	//getall
	List<CategoryDto> getCategories();

}
