<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Request param name is: ${param.name} <br>
Request param empID is: ${param.empID} <br>
Request param food is: ${param.food} <br>
First food request param: ${paramValues.food[0]} <br>
Second food request param: ${paramValues.food[1]} <br>
Request param name: ${paramValues.name[0]}<br>
Host is: ${header["host"]}<br>
Host is: ${header.host}<br>
Request Method is: ${pageContext.request.method}<br>

</body>
</html>