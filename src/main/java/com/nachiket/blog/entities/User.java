package com.nachiket.blog.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String about;
}
