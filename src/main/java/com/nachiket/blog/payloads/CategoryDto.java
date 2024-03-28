package com.nachiket.blog.payloads;
import javax.validation.constraints.*;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	@NotBlank
	@Size(min=4,message="Minimum length is 4")
	private String categoryTitle;
	@NotBlank
	@Size(min=4,message="Minimum length is 4")
	private String categoryDescription;

}
