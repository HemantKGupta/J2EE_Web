
<%@ page import="foo.Counter"%>
<html>
<body>
<%out.println("Hi Testing JSP"); %><br>
<%out.println(Counter.getCount()); %><br>
again<br>
<%= Counter.getCount() %>

</body>
</html>