package learn.java.designpattern.factory;

public class FourWheeler extends Vehicle{
	int wheel;

	FourWheeler(int wheel) {
		this.wheel = wheel;
	}

	@Override
	int getWheels() {
		return this.wheel;
	}
	
}
