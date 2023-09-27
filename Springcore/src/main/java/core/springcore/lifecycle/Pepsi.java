package core.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		// destroy ---> destroy method
		System.out.println("pepsi destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//after property set ---> init method
		System.out.println("pepsi init : from init");
	}
	

}
