<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<body bgcolor="grey">

<jsp:include page="banner.jsp"/>


<form action="User.hola">
Name: <input type="text" name="name" ><br><br>
 E-mail: <input type="email" name="email" required><br><br>
Password: <input type="password" name="pass" pattern=".{2,}" title="Six or more characters" required><br><br>
Age:<select  name="age"><% for(int a=18;a<=60;a++){%>
				<option value="<%=a%>"><%=a%></option>
	<% }%>
	</select>
	

Gender<input type="radio" name="gender" value="male"> Male <input type="radio" name="gender" value="female" required> Female<br><br>
City:<input type="text" name="city" required><br><br> 


Favourite Movie:<input type="password" name="qn" required><br><br>
Photo:<input type="file" id="myFile"><br><br>
    <input type="submit"  value="Submit">
    
   
</form>
<%@ include file="footer.html" %>
</body>
</html>