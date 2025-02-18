package com.example.coding.LearningSpringFramework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.coding.LearningSpringFramework.game.GameRunner;
import com.example.coding.LearningSpringFramework.game.MarioGame;
import com.example.coding.LearningSpringFramework.game.PacMan;
import com.example.coding.LearningSpringFramework.game.SuperContra;

public class App02HelloworldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch a spring context
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfigurationclass.class)){
			//2. configure the things that we want spring to manage - @configuration -- here created class is used above in step1
			//HelloWorldConfigurationclass - @Configuration
			//name -@Bean
			
			//Retrieving beans managed by spring
			System.out.println(context.getBean("name")); 
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
		
		


	}

}
