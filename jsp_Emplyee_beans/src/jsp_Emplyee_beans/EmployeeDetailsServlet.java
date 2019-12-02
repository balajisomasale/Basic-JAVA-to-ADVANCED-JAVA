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

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
		Date d=new Date();
		try {
			d = f1.parse("08/07/1987");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		String[] arr={"Information Technology","Accounts","Statistics"};
		request.setAttribute("arr", arr);
	
		
	request.setAttribute("emp", new Employee(969143,"John","male",d,"fulltime","Information Technology",120000));
	
	
	
	
	
	RequestDispatcher rd=request.getRequestDispatcher("/edit-employee.jsp");
	rd.forward(request, response);
	
	
	
	
	}



}
