package sessions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PreferenceHandlerServlet")
public class PreferenceHandlerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(false);
		boolean f;
		if(request.getParameter("status")!=null)
		{
			
			f=true;
			
			
		}
		else f=false;
		
		
		
		String s=(String) session.getAttribute("name");
		String s1=(String) session.getAttribute("email");
	
		

		session.setAttribute("ses",new User(s,f,s1));
		//request.getAttribute("ses");

		RequestDispatcher rd=request.getRequestDispatcher("personal-info.jsp");
		rd.forward(request, response);
		
	}

}
