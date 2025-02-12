package com.abhi.springcore.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhi/springcore/property/PropertyConfig.xml");
		Language lang = (Language) ctx.getBean("countryAndLanguage");
		System.out.println("Country and Language : "+lang);
		System.out.println(lang.getClass().getName());

	}
}
