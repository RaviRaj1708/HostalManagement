package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Login;
import com.aartek.model.Registration;
import com.aartek.service.RegitrationService;
import com.aartek.validator.RegistrationUserValidator;
@Controller
public class RegistrationController 
{
	
	@Autowired
	private RegistrationUserValidator rv;
	
	@Autowired
	private RegitrationService registrationService;
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String Registration(Map<String, Object>map,Registration  registration)
	{
		System.out.println("registration page");
		
	 	map.put("Registration",registration );		
		return "registration";
	}
	@RequestMapping(value="/submitRegistration", method = RequestMethod.POST)
	
	public String submitlogin(@ModelAttribute("Registration") Registration registration, BindingResult result)
	{
		//boolean status=false;
		rv.validate(registration,result);
//		
		System.out.println("registration controller");
			if(result.hasErrors())
			{
				return "registration";
			}
		
		
        System.out.println("Email:"+registration.getEmail());		
        System.out.println("password:"+registration.getPassword());
        registrationService.userRegistration(registration);
		return "registration";
	}


}
