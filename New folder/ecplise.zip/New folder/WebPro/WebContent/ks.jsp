<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=wheat text=spinach>
<h1>hello world</h1>
<hr>
<h2>Welcome to java server pages</h2>
<h3>VISIT TIME: <%= new Date() %></h3>
<%! int counter =1001; %>
<h3>Visitor no:  <%=counter++ %></h3>

</body>
</html>