<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.LTI.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Student s =new Student();
s.setFname("Siimi");
s.setLname("dragneel");
s.setPercentage(33);

%>
Name: <%= s.getFname() %><br>
LastName: <%= s.getLname() %><br>
Percentage: <%= s.getPercentage() %><br>
</body>
</html>