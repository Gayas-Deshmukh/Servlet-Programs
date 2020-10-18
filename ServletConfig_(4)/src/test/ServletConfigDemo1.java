package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo1 extends HttpServlet
{      
	String value1;
	String value2;

	// fetch the data
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		value1=config.getInitParameter("language");
		value2=config.getInitParameter("version");
	}
	// print the data
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter pw=resp.getWriter();

		pw.print("<h1>THE LANGUAGE IS "+value1+"</h1>");
		pw.print("<h1>THE VERSION IS "+value2+"</h1>");
	}
}
