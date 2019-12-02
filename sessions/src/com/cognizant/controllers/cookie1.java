package com.cognizant.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie1")
public class cookie1 extends HttpServlet {
	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	Cookie ck[]=request.getCookies();
	PrintWriter pw=response.getWriter();
	pw.println("Value  is "+ck[0].getValue());
	
	
	
	}


}
