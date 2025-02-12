package com.abhi.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Paitent implements InitializingBean, DisposableBean {

	private int id;

	Paitent() {
		System.out.println("Creating Paitent");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Initializing Paitent");
		this.id = id;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after property set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Before destroying the bean");
	}

}
