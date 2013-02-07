import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


public class Dog implements HttpSessionBindingListener {
	private String bread;
	public Dog(String bread){
		this.bread=bread;
		
	}
	public String getBread(){
		return bread;
	}
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("Attribute value is bounded");

	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("Attribute value is unbounded");

	}

}
