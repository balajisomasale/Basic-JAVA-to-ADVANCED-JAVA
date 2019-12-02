package com.cognizant.controllers;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class serv extends GenericServlet {
	private static final long serialVersionUID = 1L;
    
    public serv() {
        super();
      
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		System.out.println("From Service");
		
		
	}
	
	
	public void init()
	{
		
		System.out.println("From INIT");
		
	}
	public void destroy()
	{
		System.out.println("From Destroy");
	}

	
	
}
