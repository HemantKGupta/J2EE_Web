<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" class="foo.Person" scope="request"/>
Dog's Name is :<jsp:getProperty name="person" property="dog" /><br>

Dog's Name is(by EL) :${person.dog.name}<br>
Person's Name is(by EL) :${person.name}<br>
Person's Name is(by EL) :${person["name"]}<br>
Yoy will get Dog(by EL) :${person.dog}<br>
Dog's Name is(by EL) :${person["dog"].name}<br>
</body>
</html>