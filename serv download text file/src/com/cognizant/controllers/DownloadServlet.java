package com.cognizant.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/textFile")
public class DownloadServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	
	PrintWriter pw=response.getWriter();
	
	String fname="hello.txt";
	String fpath="C:\\Users\\799451\\serv download text file\\WebContent\\";
	response.setContentType("APPLICATION/OCTET-STREAM");
	
		response.setHeader("Content-Disposition", "attachment;filename=\""+fname+"\"");
	
				
			FileInputStream fileInputStream=new FileInputStream(fpath+fname);
		int i;
		while((i=fileInputStream.read())!=-1)
		{
			
			pw.write(i);
			
			
		}
				fileInputStream.close();
				pw.close();
				
				
	}

	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

	doGet(request,response);
	}	
	}
