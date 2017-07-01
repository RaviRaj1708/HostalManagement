package com.aartek.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Registration;
@Controller
public class DashbordController
{
	@RequestMapping(value="/dashbord", method = RequestMethod.GET)
	public String login(Map<String, Object> map)
	{
		System.out.println("dashbord controller");
		
		//map.put("Registration", reg);
		return "dashbord";
	}

}
