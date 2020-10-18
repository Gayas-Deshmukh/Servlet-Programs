package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginlink")
public class Validate extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// fetch the value from HTML page
		String user=req.getParameter("user");
		String password=req.getParameter("password");
		
		// validate the details, create the session and forward thr request
		if(user.equals("admin")&& password.equals("root"))
		{
			HttpSession ses=req.getSession(true);
			ses.setAttribute("enduser", user);
			
			RequestDispatcher rd=req.getRequestDispatcher("profilelink");
			rd.forward(req, resp);
		}
		else
		{
			resp.sendRedirect("index.html");
		}
	}
}
