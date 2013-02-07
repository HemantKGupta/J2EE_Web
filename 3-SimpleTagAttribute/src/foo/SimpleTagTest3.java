package foo;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest3 extends SimpleTagSupport {	
	private List movieList;	
	
	public void setMovieList(List movieList) {
		this.movieList = movieList;
		
	}

	public void doTag()throws JspException,IOException{
		Iterator i = movieList.iterator();
		while(i.hasNext()){
			Movie movie =(Movie)i.next();
			getJspContext().setAttribute("movie", movie);
			getJspBody().invoke(null);
		}
		
	
	}

}
