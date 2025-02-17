package com.abhi.springcore.lc.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

public class Paitent {

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

	//@PostConstruct
	private void hi() {
		System.out.println("Init");
	}

	//@PreDestroy
	private void bye() {
		System.out.println("destroy");
	}
	
}
