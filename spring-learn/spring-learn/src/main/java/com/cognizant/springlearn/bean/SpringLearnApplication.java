package com.cognizant.springlearn.bean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.dao.Empcontroller;
//@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
	
	SpringApplication.run(SpringLearnApplication.class, args);
	
	
	//displayEmployee();
	
	getempcontroller();
	
	}
	


public static void displayEmployee() 
{

	ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");

	Employee emp =(Employee) context.getBean("emp",Employee.class);
		
		LOGGER.debug("Countries List : {}",emp.toString());
		
	
	
	
	
	

		
	
	
}
public static void getempcontroller()
{


	ApplicationContext context = new ClassPathXmlApplicationContext("test1.xml");

	//Employee emp =(Employee) context.getBean("emp",Employee.class);

	Empcontroller ec=(Empcontroller) context.getBean("ec");
	
	
}


private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

}