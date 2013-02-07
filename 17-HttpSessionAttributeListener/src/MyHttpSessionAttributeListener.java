import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class MyHttpSessionAttributeListener implements
		HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("attribute added");

	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("attribute removed");

	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("attribute replaced");

	}

}
