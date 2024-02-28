package com.nachiket.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter
public class UserDto {
	private int id;
	@NotEmpty
	@Size(min=4,message="Username must me gratr than 4 chars")
	private String name;
	@Email(message="Email Id is not valid")
	private String email;
	@NotEmpty
	@Size(min=3,max=10,message="The password must be grater than 3 chars and less than 10 chars..!")
	private String password;
	@NotEmpty
	private String about;

}
