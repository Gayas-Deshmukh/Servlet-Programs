package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo5  extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	String no1=req.getParameter("no1");
	String no2=req.getParameter("no2");
	String choice1=req.getParameter("add");
	String choice2=req.getParameter("multiply");
	
	double n1=Double.parseDouble(no1);
	double n2=Double.parseDouble(no2);
	
	PrintWriter pw=resp.getWriter();
	
	if(choice1!=null)
	{
		pw.print("<h1>ADDITION RESULT IS "+(n1+n2)+" </h1>");
	}
	 else if(choice2!=null)
	{
		pw.print("<h1>MULTIPLICATION RESULT IS "+(n1*n2)+" </h1>");
	}
}
}
