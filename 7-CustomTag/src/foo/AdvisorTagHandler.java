package foo;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AdvisorTagHandler extends SimpleTagSupport {
	private String user;
	
	public void doTag() throws JspException,IOException{
		getJspContext().getOut().write("Hello "+user+"<br>");
		getJspContext().getOut().write("Your advice is :"+ getAdvice());
	}
	
	public void setUser(String user){
		this.user=user;
		
	}
	String getAdvice(){
		String[] adviceStrings = {"abc", "def", "ghi", "jkl"};
		int random = (int)(Math.random()*adviceStrings.length);
		return adviceStrings[random];
		
	}

}
