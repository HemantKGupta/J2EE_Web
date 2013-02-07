

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



 public class DownloadSer extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/jar");
		ServletContext ctx = getServletContext();
		InputStream is = ctx.getResourceAsStream("/resolver.jar"); 
		int read =0;
		byte[] bytes =new byte[1024];
		ServletOutputStream os = response.getOutputStream();
		while( (read = is.read(bytes)) != -1 ){
			os.write(bytes, 0, read);	
		}
		os.flush();
		os.close();
		
	}  	
		  	    
}