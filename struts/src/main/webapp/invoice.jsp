<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="logout.jsp" %>
<body>
	<%
		Enumeration e=session.getAttributeNames();
	
		while(e.hasMoreElements()){
			String name=e.nextElement().toString();
			String value=session.getAttribute(name).toString();
			if(name.equals("shopid") || name.equals("formid")){
				
			}
			else{
				out.println("<h1>"+name+":"+value+"</h1>");	
			}
			
		}
	
	%>
</body>
</html>