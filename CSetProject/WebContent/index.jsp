<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="userValue" scope="request" value="cowboy">
</c:set>
<br>Request param is ${userValue}

</body>
</html>