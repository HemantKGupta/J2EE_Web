import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

 public class Test extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
    	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<br>HttpServletRequest methods are :");
		out.println("<br>ContentLength :"+request.getContentLength());
		out.println("<br>ContentType :"+request.getContentType());
		out.println("<br>ContextPath :"+request.getContextPath());
		out.println("<br>LocalAddr :"+request.getLocalAddr());
		out.println("<br>LocalName :"+request.getLocalName());
		out.println("<br>LocalPort :"+request.getLocalPort());
		out.println("<br>Method :"+request.getMethod());
		out.println("<br>Protocol :"+request.getProtocol());
		out.println("<br>RemoteAddr :"+request.getRemoteAddr());
		out.println("<br>RemotePort :"+request.getRemotePort());
		out.println("<br>RemoteHost :"+request.getRemoteHost());
		out.println("<br>RequestURI :"+request.getRequestURI());
		out.println("<br>ServerName :"+request.getServerName());
		out.println("<br>ServerPort :"+request.getServerPort());
		out.println("<br>Header User-Agent :"+request.getHeader("User-Agent"));
		out.println("<br>Query String :"+request.getQueryString());
		out.println("<br>HttpServletResponse methods are :");
		out.println("<br>Buffersize of response is:"+response.getBufferSize());
		out.println("<br>Character coding of response is:"+response.getCharacterEncoding());
		out.println(response.getContentType());
		
		
	}  	
		  	    
}
