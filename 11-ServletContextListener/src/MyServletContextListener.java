import javax.servlet.*;
public class MyServletContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context is destroyed");
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context is initialized");
		ServletContext sc = sce.getServletContext();
		String dogBread = sc.getInitParameter("dog");
		Dog d = new Dog(dogBread);
		sc.setAttribute("dog", d);
		
	}

}
