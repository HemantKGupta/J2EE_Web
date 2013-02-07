
<%@ page import="foo.Counter"%>
<html>
<body>
<%out.println("Start count is:"); %><br>
<%out.println(Counter.getCount()); %><br>
Once again accessed, now count is:<br>
<%= Counter.getCount() %>

</body>
</html>