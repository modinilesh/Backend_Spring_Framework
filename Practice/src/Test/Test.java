package Test;

public class Test {
	
	public static void method(Object o) {
		System.out.println("Hello");
	}
	
	public static void method(String s) {
		System.out.println("World");
	}

	public static void main(String[] args) {
		Object o = null;
		method(o);

	}

}
