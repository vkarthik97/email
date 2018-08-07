<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>forgot password</title>
</head>
<body bgcolor="grey">
<h1>Forgot Password</h1>
<form action="User.hola">
  E-mail: <input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"><br><br>
  Question: <input type="password" name="qn"><br><br>
            <input type="submit"  value="submit">
 </form>

</body>
</html>