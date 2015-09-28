<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="cst" class="model.Customer" scope="request" />
	Thank you
	<jsp:getProperty property="lname" name="cst" />
	for registering...
	<br> ${requestScope.cst.fullName}
	<br> ${header["User-Agent"]}
	<br> ${requestScope.cst.fname} ${requestScope.cst.lname}
	<br> ${4 mod 2}
	<br> 
	<c:forEach var="item" items="${requestScope.cst.details}">
	${item.key} : ${item.value} <br />
	</c:forEach>
	<br>
	<c:choose>
		<c:when test=""></c:when>
		<c:otherwise></c:otherwise>

	</c:choose>

	<br>
	<c:set var="salary" value="${requestScope.cst.salary}" scope="request" />

	<p>
		Your salary is :
		<c:out value="$${salary}" />
	</p>
	<c:choose>
		<c:when test="${salary <= 10}">
       		u suck
   	 	</c:when>
		<c:when test="${salary <= 100}">
        	ur ok
   		</c:when>
   		<c:when test="${salary <= 1000}">
        	ur good
   		</c:when>
		<c:otherwise>
        	No comment sir...
    	</c:otherwise>
	</c:choose>

</body>
</html>