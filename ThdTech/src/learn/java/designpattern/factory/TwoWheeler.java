package learn.java.designpattern.factory;

public class TwoWheeler extends Vehicle{

	int wheel;
	
	TwoWheeler(int wheel){
		this.wheel=wheel;
	}

	@Override
	int getWheels() {
		return this.wheel;
	}

}
