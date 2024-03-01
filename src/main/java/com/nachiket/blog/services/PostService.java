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
	
	List<Post> getAllPost();
	
	//get post
	
	Post getPostById(Integer postId);
	
	
	// get all post by category
	
	List<Post> getPostsByCategory(Integer categoryId);
	
	
	//get all post by user
	
	List<Post> getPostsByUser(Integer userId);
	
	
	//search pst by keyword
	
	List<Post> seacrhPosts(String keyword);
	
	
}
