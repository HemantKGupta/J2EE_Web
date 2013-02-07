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
		out.println("Testing http session attribute listeners.");
		HttpSession hs = request.getSession(); 
		hs.setAttribute("test", "anatt");
		out.println("<br>Session attribute is added.");
		String att = (String)hs.getAttribute("test");
		out.println("<br>Got session attribute: "+att);
		hs.setAttribute("test", "another");
		String att2 = (String)hs.getAttribute("test");
		out.println("<br>Replaced session attribute: "+att2);
		hs.removeAttribute("test");
		out.println("<br>Session attribute is removed.");
		
	}  	
	  	  	    
}