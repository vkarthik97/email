<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body bgcolor="grey">
<h1>login</h1>
<%if(request.getParameter("invalid")!=null){ %>
<font size="3" color="red" >Invalid Id</font>
<%} %>
<form action="User.hola">
  E-mail: <input type="email" name="email"   title="enter valid email" required><br><br>
  Password: <input type="password" name="pass"  title="8 or more characters"required><br><br>
            <input type="submit"  value="submit"><br>
            <a href="forget.jsp">Forgot Password</a>
</form>

</body>
</html>