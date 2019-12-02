package com.cognizant.constructors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/req1")
public class req1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//REQUEST SCOPE
			//student s=(student)request.getAttribute("ob");
		
		
		//Https Session Scope  
		//HttpSession session =request.getSession(true);
		//student s=(student)session.getAttribute("ob");
		
		
		ServletContext context = request.getServletContext();
		student s=(student)context.getAttribute("ob");
		
		
			String sname=s.getStudentname();
			int  sid=s.getStid();
			
			PrintWriter pw=response.getWriter();
			pw.println("Student Name " +sname+" id is "+sid);
			
			
			
			
		}
	
	
	
	
	}


