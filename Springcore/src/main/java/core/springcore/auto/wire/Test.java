package core.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/auto/wire/autowireconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1);

	}

}
