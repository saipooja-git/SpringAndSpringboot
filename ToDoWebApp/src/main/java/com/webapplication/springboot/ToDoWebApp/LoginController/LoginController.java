package com.webapplication.springboot.ToDoWebApp.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class LoginController {
@Autowired
	private AuthenticateService auth;
	
	public LoginController(AuthenticateService auth) {
	super();
	this.auth = auth;
}
	@RequestMapping(value="login",method=RequestMethod.GET)
public String Login() {
	return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String Welcome(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String password,ModelMap model) {
		if(auth.authenticate(firstname, lastname, password)) {  // ✅ Correct
		model.put("firstname", firstname);
		model.put("lastname", lastname);
		model.put("password", password);
		return "welcome";
		}
		model.put("errorMessage","Invalid username and password entered.");
		return "login";
		
		
}

}
