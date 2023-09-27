package core.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
//		
//		//to tell that spring that we have destroy method and he needs to run this after work done so we need to register the hook
//		//hook is not defined in ApplicationContext interface
//		//so we will use AbstractApplicationContext
		context.registerShutdownHook();
//		System.out.println("+++++++++++++++++++++++++++++++");
//		
//		//creating pepsi
//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		System.out.println(p1);
		
		Tea t1 = (Tea) context.getBean("t1");
		System.out.println(t1);
		
	}

}
