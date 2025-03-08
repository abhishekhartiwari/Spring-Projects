package com.abhi.spring.springjavaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service s1 = c.getBean(Service.class);
		Service s2 = c.getBean(Service.class);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s2.save();
		c.close();
	}

}
