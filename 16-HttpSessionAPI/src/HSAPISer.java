

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 public class HSAPISer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing http session api url.");
		HttpSession hs = request.getSession();
		out.println("<br>CreationTime :"+ hs.getCreationTime());
		out.println("<br>Id :"+ hs.getId());
		out.println("<br>LastAccessedTime :"+ hs.getLastAccessedTime());
		out.println("<br>MaxInactiveInterval :"+ hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(2*60);
	
		
	
	}  	
		  	    
}