package com.abhi.springmvcorm.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.springmvcorm.dao.UserDao;
import com.abhi.springmvcorm.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {

		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> allUser = dao.allUser();
		 Collections.sort(allUser);
		 return allUser;
	}

	@Override
	public User getUser(Integer id) {
		User user = dao.findUser(id);
		return user;
	}

}
