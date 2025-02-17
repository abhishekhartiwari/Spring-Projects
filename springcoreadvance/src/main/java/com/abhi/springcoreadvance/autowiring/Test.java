package com.abhi.springcoreadvance.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcoreadvance/autowiring/Config.xml");
		
		Employee emp = (Employee) ctx.getBean("employee");
		
		System.out.println(emp);
		
	}

}
