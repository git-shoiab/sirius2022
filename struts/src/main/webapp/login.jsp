https://fluvid.com/videos/detail/8EL-9T-R8midv2LZy#.Ykqf2lvjqYo.link

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do;jsessionid=<%=session.getId() %>" method="post">
	<input type="hidden" name="formid" value="login">
		UserName:<input type="text" name="uname">
		PassWord:<input type="password" name="upass">
		
		<input type="submit" value="Login..">
	</form>
</body>
</html>

