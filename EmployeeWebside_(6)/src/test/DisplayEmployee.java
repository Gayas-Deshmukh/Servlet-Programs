package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displaylink")
public class DisplayEmployee extends HttpServlet
{    
	Connection con;
	@Override
	public void init(ServletConfig config) throws ServletException
	{    
		// initialize the database resources
		ServletContext context=config.getServletContext();
		String driver=context.getInitParameter("Driver");
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String password=context.getInitParameter("password");

		try
		{
			Class.forName(driver);

			con=DriverManager.getConnection(url, user, password);
		}
		catch (ClassNotFoundException | SQLException e)
		{

			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// declare the database resources
		Statement stmt=null;
		ResultSet rs=null;
		
		PrintWriter pw=resp.getWriter();
		
		// write the sql query
		String query="select * from employee_data";

		// follow the  jdbc connectivity steps 
		 try 
		{
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(query);
			
			pw.print("<table  rules='all' frame='box' width='50%'>");
			pw.print("<caption><h1>Employee Information</h1></caption>");
			pw.print("<thead>");
			pw.print("<tr>");
			pw.print("<th>ID</th>");
			pw.print("<th>NAME</th>");
			pw.print("<th>DESIGNATION</th>");
			pw.print("<th>SALARY</th>");
			pw.print("</tr>");
			pw.print("</thead>");
			pw.print("<tbody>");
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String designation=rs.getString(3);
				double salary=rs.getDouble(4);
				
				pw.print("<tr>");
				pw.print("<td>"+id+"</td>");
				pw.print("<td>"+name+"</td>");
				pw.print("<td>"+designation+"</td>");
				pw.print("<td>"+salary+"</td>");
				pw.print("</tr>");
			}
			pw.print("</tbody>");
			pw.print("</table>");
		} 
		catch (SQLException e) 
		{

			e.printStackTrace();
		}

	}
}
