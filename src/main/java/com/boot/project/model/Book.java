package com.boot.project.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@NotNull(message="ISBN can not be null")
	private Integer isbn;
	
	@NotBlank(message="Book Name Requried")
	private String name;
	
	@NotBlank(message="Book Author Required")
	
	@Size(min=5,max=30, message="Author name between 5 to 30 characters")
	private String author;
}
