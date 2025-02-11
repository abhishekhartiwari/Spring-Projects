package com.abhi.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/map/MapConfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
		System.out.println(customer.getClass().getName());

	}
}
