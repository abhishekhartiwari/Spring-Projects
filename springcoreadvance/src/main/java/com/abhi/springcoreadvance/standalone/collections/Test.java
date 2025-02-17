package com.abhi.springcoreadvance.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcoreadvance/standalone/collections/Config.xml");
		
		ProductList pl = (ProductList) ctx.getBean("productList");
		
		System.out.println(pl);
		
	}

}
