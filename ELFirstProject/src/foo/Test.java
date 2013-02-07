package foo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class Test extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Person p = new Person();
	p.setName("hemant");
	Dog d = new Dog();
	d.setName("pummy");
	p.setDog(d);
	request.setAttribute("person", p);
	RequestDispatcher view = request.getRequestDispatcher("result.jsp");
	view.forward(request, response);
	}  	
	  	  	    
}