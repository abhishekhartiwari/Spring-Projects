package com.abhi.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/list/ListConfig.xml");
		Hospital h = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital : " + h.getName());
		System.out.println("Department : " + h.getDepartment());
		System.out.println("Class : " + h.getDepartment().getClass());
	}
}
