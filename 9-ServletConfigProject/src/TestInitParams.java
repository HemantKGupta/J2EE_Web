

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class TestInitParams extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing init parameters <br>");
		Enumeration e =getServletConfig().getInitParameterNames();
		while (e.hasMoreElements()){
			out.println("<br>Init parameter is " + e.nextElement()+ "<br>");
			
		}
		out.println("Admin email is :" + getServletConfig().getInitParameter("adminEmail"));
		out.println("<br>");
		out.println("Main email is :" + getServletConfig().getInitParameter("mainEmail"));
	}  	
	 	  	    
}