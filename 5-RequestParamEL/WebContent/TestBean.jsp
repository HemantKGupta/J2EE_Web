<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Host is : ${header.host}<br>
Method is: ${pageContext.request.method}<br>
Request param name is : ${param.name}<br>
Request param empId is : ${param.empID}<br>
Request param food is : ${param.food}<br>
First food request param is : ${paramValues.food[0]}<br>
Second food request param is : ${paramValues.food[1]}<br>

</body>
</html>