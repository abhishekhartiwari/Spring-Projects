package com.abhi.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("hello");
		
		mnv.addObject("id", 123);
		mnv.addObject("name", "Abhishek");
		mnv.addObject("salary", 10000);
		
		return mnv; 
	}
}
