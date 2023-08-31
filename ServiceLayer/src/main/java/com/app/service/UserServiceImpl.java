package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository uRepo;

	@Override
	public User SaveUser(User user) {

		User newUser = new User();
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
		User user1 = uRepo.save(newUser);

		return user1;
	}

}
