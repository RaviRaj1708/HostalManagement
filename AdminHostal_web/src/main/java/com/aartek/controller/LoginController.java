package com.aartek.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Login;
import com.aartek.model.Registration;

@Controller
public class LoginController {

	/*@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoad()
	{
		
		System.out.println("admin login");
		return "login"; 
	}*/
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Map<String, Object> map, Login reg)
	{
		System.out.println("admin login");
		
		map.put("Login", reg);
		return "login";
	}
}
