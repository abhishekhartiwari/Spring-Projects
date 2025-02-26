package com.abhi.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.abhi.springjdbc.employee.dao.EmployeeDao;
import com.abhi.springjdbc.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/springjdbc/employee/test/Config.xml");

		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");

		Employee employee = new Employee();
		
		employee.setId(3);
		employee.setFirstname("Kavita");
		employee.setLastname("Pandey");
		
		//int result = employeeDao.create(employee);
		
		//int result = employeeDao.update(employee);
		
		//int result = employeeDao.delete(2);
		
		//Select query single record
		//Employee employee2 = employeeDao.read(1);
		
		List<Employee> lit = employeeDao.read();
		System.out.println("Employees are present: " + lit);
	}

}
