<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<strong>Movie List:</strong>
<br><br>
<table>
<c:forEach var="movie" items="${movieList}" varStatus="counter">
<tr>
<td>Count: ${counter.count}</td>
</tr>
<tr>
<td>${movie}</td>
</tr>
</c:forEach>
</table>
</body>
</html>