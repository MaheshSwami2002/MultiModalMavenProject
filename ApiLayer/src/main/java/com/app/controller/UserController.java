package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService uService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		System.out.println(user);
		User responce = uService.SaveUser(user);
		System.out.println(user);

		return responce;
	}
	
	 @GetMapping("/user")
	    public User getUser() {
	        // Create a sample user for testing purposes
	        User user = new User();
	        user.setUserName("Mahesh");
	        user.setUserEmail("mahesh@example.com");

	        return user;
	    }

	    @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello, World!";
	    }
	
}
