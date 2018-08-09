<%@page import="lti.hola.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>welcome</title>
<p>hello world<p>
</head>
<body>
<jsp:include page="banner.jsp"/>
<%	RegisterBean user=(RegisterBean)session.getAttribute("User"); %>

<table align="center">
<tr><th colspan ="2"> profile detils</th></tr>
<tr><td>name</td><td><%=user.getName() %></td>></tr>
<tr><td>email</td><td><%=user.getEmail() %></td>></tr>
<tr><td>age</td><td><%=user.getAge() %></td>></tr>
<tr><td>gender</td><td><%=user.getGender() %></td>></tr>
<tr><td colspan="2"><img src="<%=user.getPhoto() %>"height="200" width="200"></td></tr>

</table>
<%@ include file="footer.html" %>
</body>
</html>