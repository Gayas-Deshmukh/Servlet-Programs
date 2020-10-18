package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
          String name=req.getParameter("studentname");
          
          String stream=req.getParameter("studentstream");
          
          PrintWriter pw=resp.getWriter();
          
          pw.print("<h1> WELCOME "+ name.toUpperCase()+" </h1>");
          
          pw.print("<h1> YOUR STREAM IS "+ stream.toUpperCase()+" </h1>");
        		  
	}
}
