package core.springcore.lifecycle;

public class Samosa {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("Setting price");
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	//Initialization method which will get executed after setting the price
	public void init() {
		System.out.println("Inside samosa init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
