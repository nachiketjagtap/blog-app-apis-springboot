package com.nachiket.blog.services;

import com.nachiket.blog.entities.Post;
import com.nachiket.blog.payloads.PostDto;

import java.util.*;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	
	Post updatePost(Integer postId);
	
	
	//delete
	void deletePost(Integer postId);
	
	
	//get all posts
	
	List<PostDto> getAllPost();
	
	//get post
	
	PostDto getPostById(Integer postId);
	
	
	// get all post by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	
	//get all post by user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	
	//search pst by keyword
	
	List<Post> seacrhPosts(String keyword);
	
	
}