<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="logout.jsp" %>
<body bgcolor="cyan">
	<h1>Grocery Shop</h1>
	<form action="shop.do" method="post">
	<input type="hidden" name="formid" value="shopping">
	<input type="hidden" name="shopid" value="shop2">
	
		Rice:<input type="checkbox" name="c1" value="rice">
		Daal:<input type="checkbox" name="c2" value="daal">
		Wheat:<input type="checkbox" name="c3" value="wheat">
		
		<input type="submit" value="shop2...Go>>>">
	</form>
</body>
</html>