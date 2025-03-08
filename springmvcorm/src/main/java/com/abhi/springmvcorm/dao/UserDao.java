package com.abhi.springmvcorm.dao;

import java.util.List;

import com.abhi.springmvcorm.entities.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> allUser();
	
	User findUser(Integer Id);

}
