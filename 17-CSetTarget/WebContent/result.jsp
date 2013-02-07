<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set target="${person}" property="name" value="hemant">
</c:set>
<br>Bean property is ${person.name}

</body>
</html>