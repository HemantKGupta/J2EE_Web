
<html>
<body>
<% Float one = new Float(42.5); %>
<%pageContext.setAttribute("foo",one); %>
<br><%= pageContext.getAttribute("foo") %><br>
<% Float two = new Float(78.5); %>
<% pageContext.setAttribute("foo", two, PageContext.SESSION_SCOPE); %>
<%= pageContext.getAttribute("foo", PageContext.SESSION_SCOPE)  %><br>
<% Float three = new Float(4567.5); %>
<% pageContext.setAttribute("foo", three, PageContext.APPLICATION_SCOPE); %>
<%= pageContext.getAttribute("foo", PageContext.APPLICATION_SCOPE)  %><br>
<% Float four = new Float(34567.5); %>
<% pageContext.setAttribute("foo", four, PageContext.REQUEST_SCOPE); %>
<%= pageContext.getAttribute("foo", PageContext.REQUEST_SCOPE)  %><br>
</body>
</html>