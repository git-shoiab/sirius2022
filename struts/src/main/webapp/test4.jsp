<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=application.getRealPath("") %>
	<%@ include file="header.jsp" %>
	<jsp:include page="header.jsp">
		<jsp:param name="cname" value="sirius...."/>
	</jsp:include>
</body>
</html>