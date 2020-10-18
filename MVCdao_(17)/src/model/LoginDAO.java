package model;

import java.sql.*;

public class LoginDAO 
{
	public boolean validation(LoginDTO dt)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String enduser=dt.getUsername();
		String endpassword=dt.getPassword();
		boolean b=false;
		
		String query="select username,password from login_data";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?user=root&password=Gayas@123");
		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				String user=rs.getString("username");
				String password=rs.getString("password");
				
				if(enduser.equals(user)&&endpassword.equals(password))
				{
					b=true;
				}
			}
			if(b==true)
			{
				return  true;
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return false;
	}
}
