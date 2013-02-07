<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="userValue" scope="request" value="cowboy">
</c:set>
<br>Request param is: ${userValue}
<c:set var="userLevel" scope="session" >
Sheriff, Bartender, Cowgirl
</c:set>
<c:forEach var="movie" items="${userLevel}">
<tr>
<td>${movie}</td>
</tr>
</c:forEach>
</body>
</html>