package com.SpringBoot.LearningSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfiguration {
	
	
	@Autowired
	private CurrencyServiceConfiguration currencyserviceconfiguration ;
	
	@RequestMapping("/config")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return currencyserviceconfiguration;
	}

}
