package com.abhi.springcore.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/lc/annotation/AnnotationConfig.xml");
		Paitent h = (Paitent) ctx.getBean("paitent");
		System.out.println("Paitent ID: " + h.getId());
		
		ctx.registerShutdownHook();

	}
}
