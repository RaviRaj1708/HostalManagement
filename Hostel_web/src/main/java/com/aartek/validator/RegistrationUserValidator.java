package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.Registration;

@Component
public class RegistrationUserValidator implements Validator
{
	public boolean supports(Class<?> clazz) {
		return Registration.class.isAssignableFrom(clazz);
	}
	public void validate(Object target, Errors errors) {
		Registration enquiry = (Registration) target;
		
		ValidationUtils.rejectIfEmpty(errors, "firstName", "error.firstName.empty");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "error.lastName.empty");
		ValidationUtils.rejectIfEmpty(errors, "email", "error.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		ValidationUtils.rejectIfEmpty(errors, "mobile", "error.mobile.empty");
		
		
		if (enquiry.getEmail() != null && enquiry.getEmail().trim().length() > 0) 
		{
			boolean b = ValidationUtilMap.validateEmail(enquiry.getEmail());
			if (enquiry.getEmail().contains("@") != true && !b) 
			{
				errors.rejectValue("email", "error.email.first.rule");
			}
			else if (enquiry.getEmail().contains(".com") != true && enquiry.getEmail().contains(".net") != true
					&& enquiry.getEmail().contains(".co.in") != true && !b)
			{
				errors.rejectValue("email", "error.email.second.rule");
			} 
			else if (!b)
			{
				errors.rejectValue("email", "error.email.required");
			}
		}
		
		
		
	}
	
}
