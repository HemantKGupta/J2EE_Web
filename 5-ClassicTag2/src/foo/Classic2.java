package foo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Classic2 extends TagSupport{
	JspWriter out;
	public int doStartTag () throws JspException {
		 out = pageContext.getOut();
		try {
			out.println("start tag");
		} catch (IOException e) {
			throw new JspException("IOException" + e.toString());
			
		}
		
		return SKIP_BODY;
	}
	public int doEndTag () throws JspException {
		try {
			out.println("end tag");
		} catch (IOException e) {
			throw new JspException("IOException" + e.toString());
			
		}
		return EVAL_PAGE;
	}

}
