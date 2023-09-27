package core.springcore.ci;

public class Certificate {
	
	private String name;

	public Certificate(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	

}
