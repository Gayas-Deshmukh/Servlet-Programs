package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerlink")
public class EmployeeRegistration  extends HttpServlet
{    
	Connection con;
	@Override
	public void init(ServletConfig config) throws ServletException
	{     
		// initialize  database recourses
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// fetch the value from HTML page
		String name=req.getParameter("empname");
		String designation=req.getParameter("empdesignation");
		String salary=req.getParameter("empsalary");

		double empsalary=Double.parseDouble(salary);

		// declared JDBC resource
		PreparedStatement pstmt=null;

		//write and execute the sql query
		String query=" insert into employee_data values(?,?,?,?)";

		try
		{
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 0);
			pstmt.setString(2, name);
			pstmt.setString(3, designation);
			pstmt.setDouble(4, empsalary);
			
			int count=pstmt.executeUpdate();
			
			//print the output
			
			PrintWriter pw=resp.getWriter();
			
			pw.print("<h1>"+count+" EMPLOYEE REGISTERED SUCCESSFULLY </h1>");

		} 
		catch (SQLException e)
		{

			e.printStackTrace();
		}

		
	}
}
