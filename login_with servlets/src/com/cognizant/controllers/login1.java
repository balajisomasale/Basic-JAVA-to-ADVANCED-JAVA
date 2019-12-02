package com.cognizant.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login1")
public class login1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		
//		String s=session.getSession(false);
	
		PrintWriter pw = response.getWriter();
		String s=(String)session.getAttribute("uname");
		pw.println("profile of "+s);
		pw.println("<a href='login1'>Profile</a>");
		pw.println("<a href='logout'>logout</a>");
		
	
	
	
	}

}
