package com.abhi.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/set/SetConfig.xml");
		CarDealer h = (CarDealer) ctx.getBean("carDealer");
		System.out.println("Hospital : " + h.getName());
		System.out.println("Department : " + h.getModel());
		System.out.println("Class type : "+h.getModel().getClass());
	}
}
