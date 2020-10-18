<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style type="text/css">
	table,td
	{
		border: 5px solid green;
		margin:10px;
		padding:10px;
		border-collapse: collapse;
	}
</style>
<body>
	<%--FETCH THE VALUE FROM HTML PAGE --%>
	
		<% 
			String n1=request.getParameter("no1");
			String n2=request.getParameter("no2");
			
			int no1=Integer.parseInt(n1);
			int no2=Integer.parseInt(n2);
		%>
		
		<table>
		<h1><%
			for(int i=no1;i<=no2;i++)
			{
				if(i%2!=0)
				{
					out.print("<tr>");
					out.print("<td>"+i+"</td>");
					out.print("</tr>");
				}
			}
		%></h1>
		
		</table>

</body>
</html>