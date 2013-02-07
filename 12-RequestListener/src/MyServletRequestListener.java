import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


public class MyServletRequestListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("Request is destroyed");

	}

	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("Request is initialized");

	}

}
