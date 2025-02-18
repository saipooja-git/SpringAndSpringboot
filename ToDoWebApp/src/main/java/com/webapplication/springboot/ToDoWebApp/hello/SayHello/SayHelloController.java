package com.webapplication.springboot.ToDoWebApp.hello.SayHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {
// "say-hello" =>  "Hello! what are you learning today?"
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you learning today?";
	}
	
	//So jsp file should be in a specific path -"src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	//src/main/resources/META-INF/resources   till this path spring mvc already knows so the following path you need to specify in 
	//application.properties in prefix as spring.mvc.view.prefix = "/WEB-INF/jsp/"
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
