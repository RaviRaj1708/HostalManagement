package com.aartek.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Login;
import com.aartek.model.Registration;
import com.aartek.service.LoginService;
import com.aartek.validator.RegistrationUserValidator;

@Controller
public class LoginController
{
	
	@Autowired
	private RegistrationUserValidator v;
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Map<String, Object> map, Registration reg)
	{
		System.out.println("login controller");
		
		map.put("Registration", reg);
		return "login";
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String submitLogin(@ModelAttribute("Registration")Registration reg,BindingResult result,HttpSession session,HttpServletRequest request,HttpServletResponse response)
	{
v.validate(reg, result);
		
		
		if(result.hasErrors())
		{
			return "login";
		}
		
		System.out.println("Inside Login Controller");
		System.out.println(reg.getEmail());
		System.out.println(reg.getPassword());
		List<Registration> login=loginService.userLogin(reg);
/*if(!login.isEmpty()){
			
			session=request.getSession();
			session.setAttribute("registration",  reg);
			
			
		return "redirect:/questionAnswer.do";
		}
		else*/
		return "login";
	}	
}
