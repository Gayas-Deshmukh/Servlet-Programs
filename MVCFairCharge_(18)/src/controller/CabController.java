package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Controller layer
import model.CabService;
@WebServlet(urlPatterns= {"/autobill","/primebill","/minbill"})
public class CabController extends HttpServlet
{
	CabService s1=new CabService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String choice= req.getServletPath();
		
		switch(choice)
		{
			case "/autobill":calculateautobill(req,resp);
							break;
							
			case "/primebill":calculateprimebill(req,resp);
							break;
							
			case "/minbill":calculateminbill(req,resp);
							break;
		}
	}

	private void calculateminbill(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		//fetch the data from html page
		double km=Double.parseDouble(req.getParameter("km"));
		int minute=Integer.parseInt(req.getParameter("minute"));
		
		 double finalbill=s1.minbill(km, minute);
		 req.setAttribute("total", finalbill);
		 
		 RequestDispatcher rd=req.getRequestDispatcher("bill.jsp");
			rd.forward(req, resp);
	
	}

	private void calculateprimebill(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		//fetch the data from html page
		double km=Double.parseDouble(req.getParameter("km"));
		int minute=Integer.parseInt(req.getParameter("minute"));
		
		 double finalbill=s1.primebill(km, minute);
		 req.setAttribute("total", finalbill);
		 

		 RequestDispatcher rd=req.getRequestDispatcher("bill.jsp");
		 				rd.forward(req, resp);
		
	}

	private void calculateautobill(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		//fetch the data from html page
		double km=Double.parseDouble(req.getParameter("km"));
		int minute=Integer.parseInt(req.getParameter("minute"));
		
		 double finalbill=s1.autobill(km, minute);
		 req.setAttribute("total", finalbill);
		 
		 RequestDispatcher rd=req.getRequestDispatcher("bill.jsp");
		 				rd.forward(req, resp);
		
	}
}
