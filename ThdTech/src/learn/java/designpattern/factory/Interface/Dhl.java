package learn.java.designpattern.factory.Interface;

public class Dhl implements Delivery{

	@Override
	public void deliver() {
		System.out.println("Deliver By using DHL");
		
	}
}
