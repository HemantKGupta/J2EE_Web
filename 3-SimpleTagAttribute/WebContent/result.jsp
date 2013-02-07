<%@ taglib prefix="mine" uri="simpleTags" %>

<html>
<body>
<mine:simple1 movieList="${movieCollection}">
<tr><br><br>
<td>${movie.name}</td><br>
<td>${movie.genere}</td>
</tr>
</mine:simple1>
</body>
</html>