

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class ExamSer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ArrayList al = new ArrayList();
		al.add("hemant");
		al.add("abc");
		al.add("xyz");
		request.setAttribute("name", al);
		RequestDispatcher view = request.getRequestDispatcher("hobby.jsp");
		view.forward(request, response);
	}  	
	   	  	    
}