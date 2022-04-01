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
	<%-- <%
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		UserFormBean obj=new UserFormBean();
		obj.setUname(uname);
		obj.setUpass(upass);
		
		//request.setAttribute("uname", uname);
		//request.setAttribute("upass",upass);
		
		request.setAttribute("userbean", obj);
		
	%> --%>
	<jsp:useBean id="obj" class="dao.UserFormBean" scope="session">
		
		<jsp:setProperty property="*" name="obj"/>
	
	</jsp:useBean>
	
	<jsp:forward page="nextbean.jsp"/>
</body>
</html>