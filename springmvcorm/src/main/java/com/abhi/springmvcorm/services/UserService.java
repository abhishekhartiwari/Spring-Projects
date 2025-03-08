package com.abhi.springmvcorm.services;

import java.util.List;

import com.abhi.springmvcorm.entities.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);

}
