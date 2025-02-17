package com.abhi.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcore/constructorinjection/ambiguity/Config.xml");
		
		Addition add = (Addition) ctx.getBean("addition");
		
		//System.out.println(add);
		
	}

}
