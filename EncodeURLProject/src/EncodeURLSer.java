

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 public class EncodeURLSer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("testing encode url <br>");
		HttpSession hs = request.getSession();
		out.println("<html><body>");
		out.println("< a href=\""+response.encodeRedirectUrl("test.html")+"\">click me </a>");
		out.println("</body></html>");
		
	}  	
		    
}