package foo;


import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class Test extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ArrayList<Object> movieCollection = new ArrayList<Object>();
		 Movie m1 = new Movie(); 
		 m1.setName("DDLJ"); 
		 m1.setGenere("Romantic"); 
		 movieCollection.add(m1);
		 Movie m2 = new Movie();
		 m2.setName("HDDCS");
		 m2.setGenere("Love");
		 movieCollection.add(m2);
		 request.setAttribute("movieCollection", movieCollection);
		 RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		 view.forward(request, response);
	}  	
	
	  	  	    
}