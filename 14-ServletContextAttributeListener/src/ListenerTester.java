import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class ListenerTester extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing context attribute listeners");
		// Before setting the context attribute- from ContextListener
		Dog d = (Dog)getServletContext().getAttribute("dog");
		out.println("<br>Initial Dog bread is :"+ d.getBread());
		// Context Attribute is added
		Dog d1 = new Dog("new bread");
		getServletContext().setAttribute("dog", d1);
		out.println("<br>Attribue is set.");
		Dog dget = (Dog)getServletContext().getAttribute("dog");
		out.println("<br>After setting the attribute, dog bread is: "+ dget.getBread());
		Dog d2 = new Dog("another braed");
		getServletContext().setAttribute("dog", d2);
		out.println("<br>Attribute is replaced.");
		Dog d2get = (Dog)getServletContext().getAttribute("dog");
		out.println("<br>After replacing the attribute, dog bread is: "+ d2get.getBread());
		getServletContext().removeAttribute("dog");
		out.println("<br>Attribue is removed.");
	}  	
	  	  	    
}