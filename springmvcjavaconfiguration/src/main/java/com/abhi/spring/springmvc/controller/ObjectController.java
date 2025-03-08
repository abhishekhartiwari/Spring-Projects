package com.abhi.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/object")
	public ModelAndView readObject() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("object");	
		Employee emp = new Employee();
		
		emp.setId(1234);
		emp.setName("Mayuri");
		emp.setSalary(3000);
		
		mv.addObject("employee", emp);
			
		return mv;
	}

}
