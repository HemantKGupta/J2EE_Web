

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 public class ListenerTester extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing session attribute binding listeners <br>");
		HttpSession hs = request.getSession(); 
		out.println("<br>Session is created.");
		Dog d = new Dog("a bread");
		hs.setAttribute("dog", d);
		out.println("<br>Attribute is set in session.");
		Dog d2 =(Dog)hs.getAttribute("dog");
		out.println("<br>Got attribute from the session: "+ d2.getBread());
		hs.removeAttribute("dog");
		out.println("<br>Attribute is removed from the session.");
		
	}  	
	  	  	    
}