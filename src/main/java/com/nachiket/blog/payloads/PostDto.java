package com.nachiket.blog.payloads;

import java.util.Date;



import lombok.*;
@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	
	
}
