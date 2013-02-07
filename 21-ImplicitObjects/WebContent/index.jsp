<html>
<body>
<% out.println("using out implicit object"); %><br>
<% out.println("using implict request  object to get context path- "+ request.getContextPath()); %><br>
<% out.println("using implicit response object to get content-type- "+ response.getContentType()); %><br>
<% out.println("using implicit page object to get class name- "+ page.getClass().getName()); %><br>
<% out.println("using implicit pagecontext object to get context path- "+ pageContext.getServletContext().getContextPath()); %><br>
<% out.println("using implicit config object to get servlet name- "+ config.getServletName()); %><br>
<% out.println("using implicit application object to get Major version- "+ application.getMajorVersion()); %><br>
<% out.println("using implicit session object to get creation time- "+ session.getCreationTime()); %> <br>
</body>
</html>
