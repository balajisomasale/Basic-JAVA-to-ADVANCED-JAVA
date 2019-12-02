package com.cts.docker_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


	@GetMapping("/docker")
	public String getDocker()
	{
		System.out.println("from controller DOCKer");
	return "string returning ";
	}
	
	
}
