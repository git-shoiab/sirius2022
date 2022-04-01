<%@page import="dao.UserFormBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Next bean jsp page...
	<%
		//out.println(request.getAttribute("uname"));
		//out.println(request.getAttribute("upass"));
		
		UserFormBean user=(UserFormBean)session.getAttribute("obj");
		
		out.println(user.getUname()+":"+user.getUpass());
	%>
</body>
</html>