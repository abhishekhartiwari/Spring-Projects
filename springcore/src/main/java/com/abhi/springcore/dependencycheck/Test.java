package com.abhi.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/dependencycheck/Config.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);
		
	

	}
}
