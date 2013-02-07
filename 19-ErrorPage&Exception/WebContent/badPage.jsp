<%@ page errorPage="errorPage.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body> 
About to be bad...
<c:catch var="myException">
<%int x = 10/0; %>
</c:catch>
<c:if test="${myException!=null}">
<br></>There was an exception: ${myException.message}
</c:if>
<br>We survived.
</body>
</html>