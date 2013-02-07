package foo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class BeerRequestFilter implements Filter {
	
	private FilterConfig fc;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		//HttpServletRequest request = (	HttpServletRequest) req;
		
		//String name = request.getRemoteUser();
		String user = fc.getInitParameter("user");
		if (user!= null) {
			fc.getServletContext().log("User "+ user+ " Updating");
		}
		
		chain.doFilter(req, res);
		

	}

	public void init(FilterConfig config) throws ServletException {
	this.fc = config;

	}

}
