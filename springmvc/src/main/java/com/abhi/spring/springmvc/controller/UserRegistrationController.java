package com.abhi.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.spring.springmvc.dto.User;

@Controller
public class UserRegistrationController {

//	@RequestMapping("/registration")
//	public ModelAndView userRegistration() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userForm");
//		return mv;
	
	//Using String to return the view, here we don't want Model
	@RequestMapping("/registration")
	public String userRegistration() {
		return "userForm";
	}

	//Below we will use ModelMap and String separately. So commenting out
//	@RequestMapping(value = "userReg", method = RequestMethod.POST)
//	public ModelAndView userRegistrationResponse(@ModelAttribute("user") User user) {
//		System.out.println(user);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userResponse");
//		mv.addObject("user", user);
//		return mv;
//	}
	
	@RequestMapping(value = "userReg", method = RequestMethod.POST)
	public String userRegistrationResponse(@ModelAttribute("user") User user) {
		ModelMap mp = new ModelMap();
		mp.addAttribute("user", user);		
		return "userResponse";		
	}
}