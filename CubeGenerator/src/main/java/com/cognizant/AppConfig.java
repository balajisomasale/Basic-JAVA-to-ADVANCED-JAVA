package com.cognizant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

	@Bean("employee")
	public Employee getEmployee()
	{
		
		Address add=new Address();
		
		add.setCity("Hyd");
		
		Employee emp=new Employee();
		emp.setAddress(add);
		
		
		
		
		
		
		return emp;
		
	}
	
	
	
	
}
