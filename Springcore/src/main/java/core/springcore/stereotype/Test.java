package core.springcore.stereotype;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/stereotype/stereotype-config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
		
		
	}

}
