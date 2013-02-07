import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;


public class MyRequestAttributeListener implements
		ServletRequestAttributeListener{

	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("Attribute added");

	}

	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("Attribute removed");

	}

	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("Attribute replaced");
	}

 

}
