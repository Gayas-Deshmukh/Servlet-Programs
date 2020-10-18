package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/datalink")
public class ServletContextDemo1 extends HttpServlet
{
	 String value1;
	 String value2;
	// fetch the data
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		ServletContext context=config.getServletContext();
		     value1= context.getInitParameter("course");
		     value2=context.getInitParameter("location");
	}
	
	//print the data
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>THE COURSE NAME IS "+value1+"</h1>");
		pw.print("<h1>THE LOCATION IS "+value2+"</h1>");
	}

}
