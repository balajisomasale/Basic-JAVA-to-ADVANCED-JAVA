package com.cognizant.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		//String i=request.getParameter("pass");
		
		
		Cookie ck = new Cookie("uname",uname);
		response.addCookie(ck);
		PrintWriter pw=response.getWriter();
		//	RequestDispatcher rd=request.getRequestDispatcher("/cookie1");
		//rd.forward(request,response);
		//PrintWriter pw=response.getWriter();
		pw.println("From cookies to 2nd serv");
		pw.println("<form action='cookie1'>");
		pw.println("<input type='submit' value='go'/>");
		pw.println("</form>");
	
		}
		
		}


