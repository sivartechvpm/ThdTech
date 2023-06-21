package learn.java.designpattern.factory;

public class VehicleFactory {

	public static Vehicle getInstance(String type, int wheel) {

		if (type.equals("two")) {
			return new TwoWheeler(wheel);
		} else if (type.equals("four")) {
			return new FourWheeler(wheel);
		}

		return null;

	}

}
