package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;






import com.aartek.repo.LoginRepo;
import com.aartek.model.Registration;




@Service("LoginService")
public class LoginService
{
@Autowired
private LoginRepo loginRepo;


public List<Registration>userLogin(Registration user)
{
	System.out.println("login service....."+ user.getEmail());
	System.out.println("login service....."+ user.getPassword());
	
	List list=loginRepo.findUserByEmailAndPassword(user);
	return list;
}


	
}
