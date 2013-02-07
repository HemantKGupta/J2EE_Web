<%@ page import="java.util.*" %>
<html>
<body>
The friends who share your hobby is of 
<% request.getParameter("hobby"); %>

are: <br>
<% ArrayList al = (ArrayList)request.getAttribute("name"); %>

<% Iterator it = al.iterator(); 
   while( it.hasNext() ){ %>
<%= it.next() %>
<br>
<%}%>

</body>
</html>