package com.abhi.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcore/constructorinjection/Config.xml");
		
		Employee emp = (Employee) ctx.getBean("employee");
		
		System.out.println(emp);
		
	}

}
