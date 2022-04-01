<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.Date"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
out.println("hello....:"+uname);
out.println(new Date());
%>
<%="hello world welcome to jsp..:"+uname %>
</body>
</html>