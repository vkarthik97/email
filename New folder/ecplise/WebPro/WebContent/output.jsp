<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="item" class="lti.bean.ProductBean" scope="request"/>
<h1>product details</h1><hr>

<jsp:getProperty property="code" name="item"/><br>
<jsp:getProperty property="name" name="item"/><br>
<jsp:getProperty property="price" name="item"/>

</body>
</html>