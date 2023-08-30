package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiLayerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiLayerApplication.class, args);
		System.out.println("aplication is running");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiLayerApplication.class);
	}

}
