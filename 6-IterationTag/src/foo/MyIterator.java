package foo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyIterator extends TagSupport {
	
	String[] movies = {"abc", "def", "ghi"};
	JspWriter out;
	int count = 1;
	
	public int doStartTag() throws JspException{		
		out = pageContext.getOut();	
		pageContext.setAttribute("movie", movies[0]);
		try {
			out.println("In start tag 	");
		} catch (IOException e) {
			throw new JspException("IOException " + e.toString());
		}		
		return EVAL_BODY_INCLUDE;
		
	
	}
	public int doAfterBody() throws JspException{		
		out = pageContext.getOut();	
		try {
			out.println("Inside the body ");
		} catch (IOException e) {
			throw new JspException("IOException " + e.toString());
		}	
		if(count!=3){
		pageContext.setAttribute("movie", movies[count++]);
		return EVAL_BODY_AGAIN;
		}else{
			return SKIP_BODY;
		}
		
	
	}
	public int doEndTag() throws JspException{		
		out = pageContext.getOut();		
		try {
			out.println("In end tag 	");
		} catch (IOException e) {
			throw new JspException("IOException " + e.toString());
		}		
		return EVAL_PAGE;
		
	
	}
	

}
