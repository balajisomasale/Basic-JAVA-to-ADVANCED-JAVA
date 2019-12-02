package com.cognizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// System.out.println("Hello World!"); 
		 PrintWriter pw=response.getWriter();
		 pw.println("Hello World!");
	//request.getRequestURL();
		// System.out.println("Welcome "+request.getParameter("name")); 
	}
}
