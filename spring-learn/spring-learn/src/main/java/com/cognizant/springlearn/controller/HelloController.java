package com.cognizant.springlearn.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.CountryService;

//
//@SpringBootApplication
//@RestController
public class HelloController {

	public static void main(String[] args)
	{
		
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("mainfdgdsf ");
	}

	@GetMapping("/helloe")
	public String sayHello()
	{
		
		System.out.println("hello method ");
		return "Wassupfdgfdg";
	}
	
	public HelloController()
	{
		
		
		
	}
}
