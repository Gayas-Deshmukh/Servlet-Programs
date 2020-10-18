package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstlink")
public class BillDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		    //declare the unit rate for customer
		
			double unitforcommercial=10.25;
			double unitforresidential=4.25;
			
			//atribute
			req.setAttribute("unit1", unitforcommercial);
			req.setAttribute("unit2", unitforresidential);
			
			//forward the request to the next servlet class
			RequestDispatcher rd=req.getRequestDispatcher("nextlink");
			rd.forward(req, resp);
			
	}
}
