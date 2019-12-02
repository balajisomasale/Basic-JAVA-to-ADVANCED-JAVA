package sessions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SignUpFormHandlerServlet")
public class SignUpFormHandlerServlet extends HttpServlet {
	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession session=request.getSession(true);
		
		session.setAttribute("ses",new User("",false ,""));
		
		
		RequestDispatcher rd=request.getRequestDispatcher("personal-info.jsp");
		rd.forward(request, response);
		
		
	}


}
