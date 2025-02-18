package com.webapplication.springboot.ToDoWebApp.AuthenticatService;

import org.springframework.stereotype.Service;
@Service
public class AuthenticateService {
public boolean authenticate(String firstname,String lastname,String password) {
	boolean isvalidFn=firstname.equalsIgnoreCase("saipooja");
	boolean isvalidLn=lastname.equalsIgnoreCase("reddy");
	boolean isvalidPw=password.equalsIgnoreCase("Pooja");
	return isvalidFn&isvalidLn&isvalidPw;
}
	

}
