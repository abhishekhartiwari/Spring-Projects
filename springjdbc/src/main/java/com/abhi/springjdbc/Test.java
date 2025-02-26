package com.abhi.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springjdbc/Config.xml");
		
		JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");


		//System.out.println("Number of records inserted " + result);
	}

}
