<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="logout.jsp" %>
<body bgcolor="green">
	<h1>Veg Shop</h1>
	<form action="shop.do;jsessionid=<%=session.getId() %>" method="post">
	<input type="hidden" name="formid" value="shopping">
	<input type="hidden" name="shopid" value="invoice">
	
		Potato:<input type="checkbox" name="c7" value="potato">
		Chillies:<input type="checkbox" name="c8" value="chillies">
		Spinach:<input type="checkbox" name="c9" value="spinach">
		
		<input type="submit" value="Invoice...Go>>>">
	</form>
</body>
</html>