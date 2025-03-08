package com.abhi.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	
	

	@RequestMapping("/param")
	public ModelAndView displayDataQueryParam(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "sal",required = false, defaultValue = "12.0") double salary) {

		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Salary :" + salary);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userForm");
		return mv;
	}

}
