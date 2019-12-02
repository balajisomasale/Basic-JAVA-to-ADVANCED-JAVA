package com.cognizant.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if (pass.equals("balu")) {
			
			HttpSession session =request.getSession();
			session.setAttribute("uname", username);
			PrintWriter pw = response.getWriter();
			
			RequestDispatcher rd = request.getRequestDispatcher("/login1");

			rd.forward(request, response);
			//Cookie ck = new Cookie(s, i);
			//response.addCookie(ck);
			// RequestDispatcher rd=request.getRequestDispatcher("/cookie1");
			// rd.forward(request,response);

			// PrintWriter pw=response.getWriter();
			//pw.println("From login to login1");
			

		} else {
			response.getWriter().println("Check your Password Once Again");
			response.getWriter().println("Redirected to login page");
			RequestDispatcher rd = request.getRequestDispatcher("/main.html");

			rd.include(request, response);
		}
	
	
	
	}


}
