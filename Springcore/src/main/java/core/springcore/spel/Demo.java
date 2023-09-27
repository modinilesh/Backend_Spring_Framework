package core.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import core.springcore.stereotype.Student;

@Component
public class Demo {
	
	@Value("#{22+42}")
	private int x;
	
	@Value("#{8 > 9 ? 42:21}")		//Normal Expression
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(26)}")		//Class Method
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")		//Class variable
	private double e;
	
	@Value("#{ new core.springcore.stereotype.Student()}") //Creating new object and injecting to st
	private Student st;
	
	@Value("#{ 8 > 7}") //invoking boolean value
	

	private boolean bool;
	
	public double getE() {
		return e;
	}
	
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public boolean isBool() {
			return bool;
		}
	
		public void setBool(boolean bool) {
			this.bool = bool;
		}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", st=" + st + ", bool=" + bool + "]";
	}
	
	
	
	
	
	

}
