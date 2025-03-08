package com.abhi.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.spring.springmvc.dto.Employee;

@Controller
public class CollectionController {

	
	@RequestMapping("/list")
	public ModelAndView readObject() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listObject");	
		
		Employee emp1 = new Employee();
		emp1.setId(1234);
		emp1.setName("Mayuri");
		emp1.setSalary(3000);
		
		Employee emp2 = new Employee();
		emp2.setId(1111);
		emp2.setName("Neelkanth");
		emp2.setSalary(5000);

		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);		
		mv.addObject("employees", emps);
			
		return mv;
	}
}
