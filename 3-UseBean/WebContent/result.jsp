<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
Person is :
<%= ((foo.Person)request.getAttribute("person")).getName() %><br>
<jsp:useBean id="person" class="foo.Person" scope="request"/>
also Person is :<jsp:getProperty name="person" property="name" /><br>
</body>
</html>