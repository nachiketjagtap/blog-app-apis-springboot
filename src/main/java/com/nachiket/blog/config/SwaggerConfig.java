 package com.nachiket.blog.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Contact;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration 
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getInfo())
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths( PathSelectors.any())
				.build();
	}

	private ApiInfo getInfo() {
		 
		return new ApiInfo("Blogging Application : Backend Project", "This project is developed by Nachiket N Jagtap", "1.0", "Terms of Service", new springfox.documentation.service.Contact("Nachiket Jagtap","https://nachiketjagtap.github.io/Personal-Portfolio/","nachiket.jagtap122021@gcoeara.ac.in"), "License of API", "API license URL",Collections.emptyList());
	}

}
