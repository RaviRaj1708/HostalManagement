package com.aartek.repo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Registration;



@Repository("LoginRepo")
public class LoginRepo 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List findUserByEmailAndPassword(Registration reg)
	{
		System.out.println("repo    "+reg.getEmail());
		System.out.println("repo    "+reg.getPassword());
		String email=reg.getEmail();
		String password=reg.getPassword();
		
		List<Registration> login=(List<Registration>)hibernateTemplate.find("from Registration al where al.email = ? and al.password = ?",email , password);
				 
			for (Registration user2 : login) {
				System.out.println(user2.getEmail());
				System.out.println(user2.getPassword());
			}
			return login;
	}
	
	
	public Registration findUserByEmail(int id)
	{
		System.out.println("IN repo");
		//System.out.println(email);
		List list=hibernateTemplate.find("from Registration  where id = ? ",id );
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Registration r=(Registration)it.next();
			return r;
		}
			return null;
	}
	
	
	public Registration deleteUserById(Registration reg)
	{
		hibernateTemplate.delete(reg);
		return reg;
	}
	

}
