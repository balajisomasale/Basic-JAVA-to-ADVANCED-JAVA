package com.cognizant.constructors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class serv1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String username=request.getParameter("uname");
	String pass=request.getParameter("pwd");
	
	
	if(pass.equals("balu"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("/serv2");
				
		rd.forward(request, response);
		
			}
		
	else
	{
		response.getWriter().println("Check your Password Once Again");
		RequestDispatcher rd=request.getRequestDispatcher("/main.html");
		
		rd.include(request, response);
		
		
		//Send redirect method 
		//response.sendredirect("www.google.com);
		
		
	}
	
	
	}

	

}
