package core.springcore.ref;

//dependent object
public class A {
	private int y;
	private B ob;
	
	//getters setters
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	
	//constructor
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "A [y=" + y + ", ob=" + ob + "]";
	}
	
	

}
