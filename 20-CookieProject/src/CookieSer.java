

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



 public class CookieSer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Testing cookies. <br>");
		Cookie c = new Cookie("username", "hemant");
		c.setMaxAge(4*60);
		response.addCookie(c);		
		RequestDispatcher view = request.getRequestDispatcher("cookieresult.jsp");
		view.forward(request, response);
		
		
		
	}  	
	
	   	  	    
}