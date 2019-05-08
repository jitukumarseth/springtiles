package com.springtilesexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@Autowired
	private UserValidator userValidator;

	@RequestMapping("/verifyUser")
	public String verifyUser(@ModelAttribute("user") User user, BindingResult result) {
		System.out.println("Veryfy User()");
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			System.out.println(result.getErrorCount());
			return "LoginDef";
		}

//	User user1 = (User) command;
		String un = user.getUsername();
		String pw = user.getPassword();
		System.out.println(un);
		System.out.println(pw);
		if (!un.equals(pw)) {
			return "LoginDef";
		}
		return "LoginSucessDef";
	}
}