import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;


public class MyServletContextAttributeListener implements
		ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent arg0) {
	System.out.println("attribute is added");

	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("attribute is removed");

	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("attribute is replaced");

	}

}
