package core.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Tea {
	
	private String sugar;

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tea [sugar=" + sugar + "]";
	}
	
	@PostConstruct 
	public void init() {
		System.out.println("Inside Tea init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Tea destroyed");
	}

}
