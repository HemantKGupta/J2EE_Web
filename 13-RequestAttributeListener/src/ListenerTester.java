import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class ListenerTester extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing request attribute listeners");
		request.setAttribute("test", "anatt");
		out.println("<br>attribute is set");
		String path = (String)request.getAttribute("test");
		out.println("<br>Got the attribute:"  + path);
		request.setAttribute("test", "anotheratt");
		out.println("<br>attribute is replaced:");
		String path2 = (String)request.getAttribute("test");
		out.println("<br>Got the attribute again:"  + path2);
		request.removeAttribute("test");
		out.println("<br>attribute is removed");
		
	}  	
	  	  	    
}