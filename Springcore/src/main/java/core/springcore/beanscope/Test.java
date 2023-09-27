package core.springcore.beanscope;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/beanscope/beanscope-config.xml");
		Student student = (Student)context.getBean("student");
		Student student1 = (Student)context.getBean("student");
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());	//By default Singleton Bean scope //after defining scope in bean Prototype scope
		
		//request
		//session
		//globalsession
		
		
		
	}

}
