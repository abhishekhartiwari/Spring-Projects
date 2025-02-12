package com.abhi.springcore.shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/shopping/ShoppingConfig.xml");
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shopping");
		System.out.println("Shopping Cart : " + shoppingCart);

	}
}
