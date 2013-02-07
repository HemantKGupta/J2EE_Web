

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 public class First extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing session attributes");
		HttpSession hs = request.getSession();
		if(hs.isNew()){
			out.println("<br>A new  session is started  <br>");
		}else{
			//Refresh browser to reach here
			out.println("welcome back  <br>");
		}
		
	}  	
	 	  	    
}