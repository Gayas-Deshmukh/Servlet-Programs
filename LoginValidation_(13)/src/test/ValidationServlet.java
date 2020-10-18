package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginlink")
public class ValidationServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{    
		// fetch the value from HTML page
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		PrintWriter pw1=resp.getWriter();
		// validate and print the output
		if(username.equals("admin") && password.equals("root"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("servletlink");
			rd.forward(req, resp);
		}
		else
		{
			PrintWriter pw=resp.getWriter();
			pw.print("<h1 style='color:red;'>Please enter valid username or password</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			
		}
		
	 }
}
