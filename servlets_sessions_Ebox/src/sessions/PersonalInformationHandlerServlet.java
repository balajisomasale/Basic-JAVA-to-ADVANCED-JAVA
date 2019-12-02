package sessions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PersonalInformationHandlerServlet")
public class PersonalInformationHandlerServlet extends HttpServlet {
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String s=request.getParameter("name");
		String s1=request.getParameter("email");
		session.setAttribute("name", s);
		session.setAttribute("email", s1);
		//request.getAttribute("ses");

		RequestDispatcher rd=request.getRequestDispatcher("/preference.jsp");
		rd.forward(request, response);
		
	}

}
