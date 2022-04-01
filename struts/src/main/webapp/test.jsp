https://fluvid.com/videos/detail/Y5V24TVLaxI9K5ABv#.YkbeWiTpFig.link

<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"
    buffer="20kb"
    autoFlush="false"
    errorPage="err.jsp"
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
for(int i=0;i<1000;i++){
	out.println(new Date());
}
%>
<%="hello world welcome to jsp..:"+uname %>
ஹாய் மற்றும் வணக்கம்
<%=application.getRealPath("") %>
<%!

	String str="hello world...";
	void met(){
	
}

%>
</body>
</html>