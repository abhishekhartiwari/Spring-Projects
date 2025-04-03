package com.abhi.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhi.spring.dao.MyDao;



@Component
public class MyService {
	
	@Autowired
	MyDao dao;
	
	public MyService(MyDao dao) {
		super();
		this.dao = dao;
		System.out.println("my service constructor");
	}

	public void save() {
		System.out.println("my service save");
		dao.create();
	}

}
