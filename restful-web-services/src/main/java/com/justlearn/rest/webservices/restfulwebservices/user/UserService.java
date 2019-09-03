package com.justlearn.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	private static List<User> userList = new ArrayList<User>();

	static {
		userList.add(new User(1, "Naren", new Date()));
		userList.add(new User(2, "Deepak", new Date()));
		userList.add(new User(3, "Prema", new Date()));
		userList.add(new User(4, "Sachin", new Date()));

	}

	public User findById(Integer id) {
		return userList.get(id-1);
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(userList.get(userList.size() - 1).getId() + 1);
		}
		userList.add(user);
		return user;
	}
	
	public List<User> findAll() {
		return userList;
	}

}
