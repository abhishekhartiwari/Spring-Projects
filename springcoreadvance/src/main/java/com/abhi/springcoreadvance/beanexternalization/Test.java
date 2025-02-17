package com.abhi.springcoreadvance.beanexternalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcore/beanexternalization/config.xml");
		
		MyDAO my = (MyDAO) ctx.getBean("mydao");
		System.out.println(my);
		
	}

}
