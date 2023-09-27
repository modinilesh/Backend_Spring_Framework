package core.springcore.spel;


import org.springframework.expression.Expression; //remember this is from expression package not from beans package

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core/springcore/spel/spel-config.xml");
		Demo demo = (Demo) context.getBean("demo");
		System.out.println(demo);
		
		//Method 2: using SpringExpressionLanguage API layer
//		SpelExpressionParser sp = new SpelExpressionParser();
//		Expression expression = sp.parseExpression("64+21");
//		System.out.println(expression.getValue());

	}

}
