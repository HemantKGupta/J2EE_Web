<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:url value="/input.jsp" var="inputURL">
<c:param name="firstname" value="abc"/>
<c:param name="lastname" value="xyz"/>
</c:url>
The URL using param is :${inputURL }<br>
<a href=${inputURL }>click here</a>
</body>
</html>