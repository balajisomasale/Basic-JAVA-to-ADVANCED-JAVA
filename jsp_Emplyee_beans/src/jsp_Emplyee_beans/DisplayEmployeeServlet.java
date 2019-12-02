package jsp_Emplyee_beans;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 long i;
		 String n,g;
		 String fulltime;
		 String department;
		
		int Salary;
		
		
	
	Date d=null;
	//boolean f,g;
	
	
	n=request.getParameter("name");
	g=request.getParameter("gender");
	department=request.getParameter("department");
	//pr=Float.parseFloat(request.getParameter("price"));
	SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
	try{
		
		d=f1.parse(request.getParameter("dateOfLaunch"));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		i=Long.parseLong(request.getParameter("id"));
		
		Salary=Integer.parseInt(request.getParameter("salary"));
		//fulltime=Integer.parseInt("fulltime");
		if(request.getParameter("fulltime")!=null)
		{
			fulltime="yes";	
		}
		else 
		{
			
			fulltime="no";
		}
		
		
		Employee m=new Employee(i,n,g,d,fulltime,department,Salary);
request.setAttribute("emp", m);
		RequestDispatcher rd=request.getRequestDispatcher("employee.jsp");
	rd.forward(request, response);
	
	
	
		
		
		
	
	
	}

}
