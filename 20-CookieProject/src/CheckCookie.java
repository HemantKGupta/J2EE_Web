

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: CheckCookie
 *
 */
 public class CheckCookie extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] cs = request.getCookies();
		for (Cookie cookie : cs) {
			if(cookie.getName().equals("username")){
				String username  = cookie.getValue();
				out.println("username  is :" + username + "<br>");
				break;
						
			}
			
		}
	}  	
	
	   	  	    
}