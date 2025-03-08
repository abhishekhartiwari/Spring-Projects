package com.abhi.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/abhi/spring/springaop/test/config.xml");
		//ProductService ps = ct.getBean(ProductService.class, "productService");
		
		ProductService ps = (ProductService) ct.getBean("productService");
		System.out.println(ps.multiply(4, 5));
	}

}
