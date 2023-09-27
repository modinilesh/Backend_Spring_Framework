package core.springcore.ci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/ci/ciconfig.xml");
		Person p1 = (Person) context.getBean("person1");
		Addition a1 =(Addition) context.getBean("add1");
		
//		System.out.println(p1);
		a1.display();
		a1.doSum();
	}

}
