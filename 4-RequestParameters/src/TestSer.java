

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class TestSer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println(today);
		String c = request.getParameter("color");
		Enumeration l = request.getParameterNames();
		out.println("<br>Parameters are :");
		while (l.hasMoreElements()){
			out.println("<br>"+l.nextElement());
			}
		out.println("<br>Choosen color is :" +c);
		String [] sizes = request.getParameterValues("sizes");
		for(int x=0; x < sizes.length ; x++) {
		out.println("<br>sizes: " + sizes[x]);
		}
	}  	
	 	  	    
}