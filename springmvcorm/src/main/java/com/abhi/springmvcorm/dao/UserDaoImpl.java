package com.abhi.springmvcorm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.springmvcorm.entities.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional(readOnly = false)
	public int create(User user) {
		Integer save = (Integer) hibernateTemplate.save(user);
		return save;
	}

	@Override
	public List<User> allUser() {
		List<User> all = hibernateTemplate.loadAll(User.class);
		
		return all;
	}

	@Override
	public User findUser(Integer Id) {

		return hibernateTemplate.get(User.class , Id);
	}

}
