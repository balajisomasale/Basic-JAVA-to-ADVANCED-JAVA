package com.cognizant.constructors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv2")
public class serv2 extends HttpServlet {
	
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("uname");
		
	PrintWriter pw=response.getWriter();
	
	pw.println("Password correct .. Welcome "+user);
	
	
	}


}
