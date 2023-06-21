package learn.java.designpattern.factory;

public abstract class Vehicle {

	abstract int getWheels();
	
	public String toString() {
		return "Wheels "+this.getWheels();
	}
}



