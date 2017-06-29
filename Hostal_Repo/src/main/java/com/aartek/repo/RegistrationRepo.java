package com.aartek.repo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.aartek.model.Registration;

@Repository("RegistrationRepo")
public class RegistrationRepo 
{
	@Autowired
	
	private HibernateTemplate hibernateTemplate;
	
	
	
	public void save(Registration reg){
		hibernateTemplate.save(reg);
	}
	public void findRegistrationEntries(Registration registration)
	{
		System.out.println("RegistrationRepo    "+registration.getFirstName());
		System.out.println("RegistrationRepo    "+registration.getLastName());
		System.out.println("RegistrationRepo    "+registration.getEmail());
		System.out.println("RegistrationRepo    "+registration.getPassword());
		System.out.println("RegistrationRepo    "+registration.getMobile());
		String firstName=registration.getFirstName();
		String lastName=registration.getLastName();
		String email=registration.getEmail();
		String password=registration.getPassword();
		String mobile=registration.getMobile();
		
		List<Registration> login=(List<Registration>)hibernateTemplate.find("from Registration al where al.email =? and al.password = ?",email , password);
			Iterator it= login.iterator();
					while(it.hasNext())
					{
						registration=(Registration)it.next();
						
						System.out.println(registration.getEmail());
						
					}
	
	}
	
	
	
	public Registration updateValue(Registration reg)
	{
		
		hibernateTemplate.saveOrUpdate(reg);
		return reg;
	}
	

}
