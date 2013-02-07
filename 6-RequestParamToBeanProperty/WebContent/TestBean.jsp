<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
Directly bean property is set from request parameter
--%>

<jsp:useBean id="person" class="foo.Person" scope="request">
<jsp:setProperty name="person" property="name" param="userName"/>

UserName is :<jsp:getProperty name="person" property="name" /><br>
</jsp:useBean>
</body>
</html>