package core.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//@Autowired 		//without using setters and constructors it will assign the values
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	@Autowired 		//It will use setter to set the values
	@Qualifier("address1") //it is used to inject the particular bean by bean's name
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}

	//@Autowired 		//It will use constructor to set the values
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	

}
