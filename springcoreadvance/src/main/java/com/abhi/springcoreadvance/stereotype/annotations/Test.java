package com.abhi.springcoreadvance.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springcoreadvance/stereotype/annotations/Config.xml");
		
		Instructor instructor = (Instructor) ctx.getBean("ins");
		System.out.println(instructor.hashCode());
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) ctx.getBean("ins");
		System.out.println(instructor2.hashCode());
		System.out.println(instructor);
		
	}

}
