package com.cognizant.constructors;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


class student
{
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public student(String studentname, int stid) {
		super();
		this.studentname = studentname;
		this.stid = stid;
	}
	public String studentname;
	public int stid;



}



@WebServlet("/req")
public class req extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	//REQUEST SCOPE
	//	request.setAttribute("ob",new student("balu",7));
		
		
		
		
		//HTTPS SESSION SCOPE
//		HttpSession session =request.getSession(true);
		//session.setAttribute("ob",new student("M S D",7));
		
		
		
		//CONTEXT SCOPE 
		ServletContext context = request.getServletContext();
		
		context.setAttribute("ob",new student("balu",7));
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/req1");
		rd.forward(request, response);
	}

}
