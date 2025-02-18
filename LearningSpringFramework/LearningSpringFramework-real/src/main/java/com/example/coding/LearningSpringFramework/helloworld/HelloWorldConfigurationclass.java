package com.example.coding.LearningSpringFramework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.coding.LearningSpringFramework.game.GameRunner;
import com.example.coding.LearningSpringFramework.game.MarioGame;
import com.example.coding.LearningSpringFramework.game.PacMan;
import com.example.coding.LearningSpringFramework.game.SuperContra;

record Person(String name,int age,Address address) {};
record Address(String firstLine,String city ) {};


@Configuration
public class HelloWorldConfigurationclass {

	@Bean
	public String name() {
		return "Pooja";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("1115 N college Dr","Maryville");
	}
	@Bean
	@Primary
	public Person person() {
		return new Person("Sai Pooja",25,new Address("Phoenix","Arizona"));
	}
	@Bean
	public Person person2() {  //method call---> this is based on the method names
		return new Person(name(),age(),address());
	}
	@Bean
	public Person person3(String name,int age,@Qualifier("address3qualifier")Address address3) {  // As Parameters so the parameter names should be same like the bean names
		return new Person(name,age,address3);
	}
	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address addresse() {
		return new Address("E 5th Street","Marryville,Missouri");
	}
	}

