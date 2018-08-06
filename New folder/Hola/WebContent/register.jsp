<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/register.jsp">
name: <input type="text" name="name" ><br>
 E-mail: <input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"><br>
Password: <input type="password" name="pw" pattern=".{6,}" title="Six or more characters"><br>
age:<input type="text" name="age" pattern="[0-1]{1}[0-9]{0,2}" title="invalid age"><br>
Gender<input type="radio" name="gender" value="male"> Male <input type="radio" name="gender" value="female"> Female<br>
City:<input type="text" name="city"><br>    
Favourite Movie:<input type="text" name="favmov"><br>
Photo:<input type="file" id="myFile"><br>
    <input type="submit">
</form>

</body>
</html>