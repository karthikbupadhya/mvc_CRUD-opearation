<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create</title>
</head>
<body>
<spring:form action="create" method="post" modelAttribute="student">
Name:<spring:input path="name"/><br>
Email:<spring:input path="email"/><br>
Mobile:<spring:input path="mobile" type="tel" pattern="[0-9]{10}"/><br>
Standard:<spring:input path="standard"/><br>
DOB:<input type="date" name="x"/><br>
<spring:button type="submit">Save</spring:button>
<spring:button type="reset">Cancel</spring:button>
</spring:form>
</body>
</html>