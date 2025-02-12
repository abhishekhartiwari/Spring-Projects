package com.abhi.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/reftypes/ReferenceConfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println("Score in Subjects : "+student);
//		System.out.println(student.getClass().getName());

	}
}
