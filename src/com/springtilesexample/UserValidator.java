package com.springtilesexample;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("UserValidate-support");		
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		System.out.println("UserValidate-Validate");
		User user = (User) command;
		if (user.getUsername() == null || user.getUsername().length() == 0) {
			errors.rejectValue("username", "error.username.required", null, "Username Required");
			
		}
		
		if(user.getPassword()==null||user.getPassword().length()==0) {
			errors.rejectValue("password", "error.password.required", null,"Password required");
		}
	}

}
