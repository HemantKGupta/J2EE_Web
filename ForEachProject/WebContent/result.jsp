<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<strong>Movie List:</strong>
<br><br>
<table>
<c:forEach var="movie" items="${movieList}">
<tr>
<td>${movie}</td>
</tr>
</c:forEach>
</table>
</body>
</html>