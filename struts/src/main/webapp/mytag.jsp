<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="/WEB-INF/myjsptags.tld" prefix="myjsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String num=request.getParameter("num");
		int n=Integer.parseInt(num);
		if(n%2==0){
			out.println("Even Number...");
		}
		else{
			out.println("Odd Number....");
		}
	%> --%>
	
	<myjsp:checkNumber num="<%=request.getParameter(\"num\") %>"/>
	
</body>
</html>