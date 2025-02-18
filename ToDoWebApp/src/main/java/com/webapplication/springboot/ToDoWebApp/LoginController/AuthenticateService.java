package com.webapplication.springboot.ToDoWebApp.LoginController;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
    public boolean authenticate(String firstname, String lastname, String password) {
        boolean isValidFn = firstname.equalsIgnoreCase("saipooja");
        boolean isValidLn = lastname.equalsIgnoreCase("reddy");
        boolean isValidPw = password.equals("Pooja"); // Passwords are case-sensitive
        
        return isValidFn && isValidLn && isValidPw;
    }
}
