package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet
 {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		//create the object of date class
		Date d1=new Date();
		
		//create the ref of printwritter
		
		PrintWriter pw=resp.getWriter();
		
		//print output
		
		pw.print("<h1 style='color:green'>CURRENT DATE AND TIME IS "+d1+"</h1>");
		
	}

}
