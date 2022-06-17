<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World!</h1>
	<p>This is my first view.</p>
	<p>
		this is passed from the controller:
		<c:out value="${ somekey }" />
	</p>
	<p>x = ${x }</p>
	<p>Hello my name is ${fist } ${lname } and my bday is ${bday }</p>
</body>
</html>