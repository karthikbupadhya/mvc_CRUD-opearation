<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>${msg}</h1>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Standard</th>
<th>Dob</th>
<th>Age</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<c:forEach var="student" items="${list}">
<tr>
<th>${student.getId()}</th>
<th>${student.getName() }</th>
<th>${student.getEmail() }</th>
<th>${student.getMobile() }</th>
<th>${student.getStandard() }</th>
<th>${student.getDob() }</th>
<th>${student.getAge() }</th>
<th><a href="delete?id=${student.getId()}"><button type="button">Delete</button></a></th>
<th><a href="edit?id=${student.getId()}"><button type="button">Edit</button></a></th>
</tr>
</c:forEach>
</table>

</body>
</html>