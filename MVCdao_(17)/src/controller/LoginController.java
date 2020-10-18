package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDAO;
import model.LoginDTO;
@WebServlet("/loginlink")
public class LoginController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//fetch the data from html page
		String username=req.getParameter("user");
		String password=req.getParameter("password");
		
		// forward the value inside DTO class
		LoginDTO dt=new LoginDTO();
		dt.setUsername(username);
		dt.setPassword(password);
		
		LoginDAO da=new LoginDAO();
		boolean b=da.validation(dt);
		
		if(b==true)
		{
			resp.sendRedirect("welcome.jsp");
		}
		else
		{
			resp.sendRedirect("index.html");
		}
		
		
	}
}
