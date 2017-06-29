package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;





import com.aartek.repo.RegistrationRepo;
import com.aartek.model.Registration;



@Service("RegitrationService")
public class RegitrationService
{
	@Autowired
	private RegistrationRepo registrationRepo;
	
	public void userRegistration(Registration registration)
	{
		System.out.println("RegistrationService.... "+registration.getFirstName());
		System.out.println("RegistrationService.... "+registration.getLastName());
		System.out.println("RegistrationService.... "+registration.getEmail());
		System.out.println("RegistrationService.... "+registration.getPassword());
		System.out.println("RegistrationService.... "+registration.getMobile());
		
		registrationRepo.save(registration);
	}

}
