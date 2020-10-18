package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo3 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// fetch the value
		 String name=req.getParameter("employname");
		 String salary=req.getParameter("employsalary");
		 
		 String designation=req.getParameter("designation");
		 
		 double employsalary=Double.parseDouble(salary);
		 
		 double updatedsalary;
		 
		 if(designation.equals("devloper"))
		 {
			 updatedsalary=employsalary+5000; 
		 }
		 else
		 {
			 updatedsalary=employsalary+4000;
		 }
		 
		 PrintWriter pw=resp.getWriter();
		 
		 pw.print("<h1>EMPLOYEE NAME IS "+name+" </h1>");
		 pw.print("<h2> UPDATED SALARY IS "+updatedsalary+"</h2>");
	}
	
}
