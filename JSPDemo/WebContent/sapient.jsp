<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="errpg.jsp"%>
<%@ page import="java.util.Date" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--JSP Comment--%>
<%--	<jsp-property-group>
			<url-pattern>scripting_off/*</url-pattern>
			<scripting-invalid>true</scripting-invalid>
		</jsp-property-group>

		<jsp-property-group>
			<url-pattern>/EL_off/*</url-pattern>
			<el-ignored>true</el-ignored>
		</jsp-property-group> --%>
<!-- HTML Comment -->

<%! public String getMessage() {
return "Hiiiii";
}%>

<%=getMessage() %>

<%= 4+3 %> <br/>

<%= Integer.parseInt("123") %>

hello
<br/>

<form action="process" method="post">
<input type="text" name="fname" placeholder="First Name">
<input type="text" name="lname" placeholder="Last Name">
<input type="text" name="salary" placeholder="Salary">
<input type="submit" value="Go">
</form>
</body>
</html>