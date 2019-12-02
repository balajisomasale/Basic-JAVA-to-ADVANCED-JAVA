package com.cts.SPRINGwithSQL;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class SprinGwithSqlApplication {

	
	@Autowired
	private  UserService userservice;
	
	
	public static void main(String[] args){
		SpringApplication.run(SprinGwithSqlApplication.class, args);
	
		
		
	
		
		//System.out.println(userservice.get);
		
	
	
	}


//	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//
//		
//	}

	

}
