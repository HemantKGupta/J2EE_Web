

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class TestContextParams extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing context parameters <br>");
		out.println("Admin email is :" + getServletContext().getInitParameter("adminEmail"));
		out.println("<br>");
		out.println("Main email is :" + getServletContext().getInitParameter("mainEmail"));
	}  	
}  	
	   	  	    
