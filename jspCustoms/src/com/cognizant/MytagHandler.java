package com.cognizant;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class MytagHandler extends SimpleTagSupport {

	
	public void doTag() throws JspException,IOException
	{
		
		JspWriter out=getJspContext().getOut();
		out.println("date");
		out.println(Calendar.getInstance().getTime());
		
	}
	
	
	
}
