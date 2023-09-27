package core.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("JavaConfig.class");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
