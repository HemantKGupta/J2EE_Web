<%@ attribute name="fontColor" required="true" %>
<%@ tag body-content="tagdependent"  %>
<html>
<body>
It is header<br>
<font color="${fontColor}"><jsp:doBody/></font>
</body>
</html>