package domain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginlink")
public class Validation extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter pw=resp.getWriter();
		String user=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(user.equals("admin")&& password.equals("root"))
		{
			pw.print("<form action='welcomelink' method='post'>");
			pw.print("<input type='hidden' value='"+user+"' name='emplname'>");
			pw.print("<input type='submit' value='next'>");
			pw.print("</form>");
		}
		else
		{
			resp.sendRedirect("login.html");
		}
	}
}
