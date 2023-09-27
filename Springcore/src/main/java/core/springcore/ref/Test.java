package core.springcore.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/ref/refconfig.xml");
		A temp = (A) context.getBean("aref");
		
		System.out.println(temp.getY());
		System.out.println(temp.getOb().getX());
		
		System.out.println(temp);

	}

}
