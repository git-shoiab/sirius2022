<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="logout.jsp" %>
<body bgcolor="yellow">
	<h1>Fruit Shop</h1>
	<form action="shop.do" method="post">
	<input type="hidden" name="formid" value="shopping">
	<input type="hidden" name="shopid" value="shop3">
	
		Mango:<input type="checkbox" name="c4" value="mango">
		Apple:<input type="checkbox" name="c5" value="apple">
		Banana:<input type="checkbox" name="c6" value="banana">
		
		<input type="submit" value="shop3...Go>>>">
	</form>
</body>
</html>