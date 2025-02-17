package com.abhi.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcoreadvance/injecting/interfaces/Config.xml");
		OrderBO b =  (OrderBO) ctx.getBean("bo");
		
		b.placeOrder();
	
	}
}
