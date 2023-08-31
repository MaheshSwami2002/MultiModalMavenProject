package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		System.out.println(user);
		User responce = uService.SaveUser(user);
		System.out.println(user);

		return new ResponseEntity<>(responce, HttpStatus.CREATED);
	}

	@GetMapping("/user")
	public ResponseEntity<User> getUser() {
		// Create a sample user for testing purposes
		User user = new User();
		user.setName("Mahesh");
		user.setEmail("mahesh@example.com");

		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
	}

}
