package com.abhi.springmvcorm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.springmvcorm.entities.User;
import com.abhi.springmvcorm.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("registrationPage")
	public String userRegistration() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String userRegistrationResponse(@ModelAttribute("user") User user, ModelMap mp) {
		
		int result = userService.save(user);
		mp.addAttribute("result", "User Created with Id "+result);
		return "userReg";
	}
	
	@RequestMapping("getUsers")
	public String getAllUser(ModelMap mp) {
		List<User> users = userService.getUsers();
		mp.addAttribute("users", users); 
		return "displayUsers";
	}
	
	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		
		User user = userService.getUser(id);
		String msg = "";
		if(user!=null) {
			msg = id + " already exists";
		}
		return msg;
	}
}
