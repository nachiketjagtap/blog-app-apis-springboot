 package com.nachiket.blog.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.annotations.Contact;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration 
public class SwaggerConfig {
	public static final String AUTHORIZATION_HEADER="Autherization";
	
	private ApiKey apiKeyes() {
		 return new ApiKey("JWT", AUTHORIZATION_HEADER, "header"); 
	}
	
	private List<SecurityContext> securityContexts(){
		return Arrays.asList(SecurityContext.builder().securityReferences(secref( )).build()); 
				
	}
	
	private List<SecurityReference>secref(){
		AuthorizationScope scope =  new AuthorizationScope("global", "accessEverything");
		 return Arrays.asList(new SecurityReference("JWT", new AuthorizationScope[] {scope})); 
		 
		 
	}
	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getInfo())
				.securityContexts(securityContexts())
				.securitySchemes(Arrays.asList(apiKeyes()))
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths( PathSelectors.any())
				.build();
	}

	private ApiInfo getInfo() {
		 
		return new ApiInfo("Blogging Application : Backend Project", "This project is developed by Nachiket N Jagtap", "1.0", "Terms of Service", new springfox.documentation.service.Contact("Nachiket Jagtap","https://nachiketjagtap.github.io/Personal-Portfolio/","nachiket.jagtap122021@gcoeara.ac.in"), "License of API", "API license URL",Collections.emptyList());
	}

}
