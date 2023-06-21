package learn.java.designpattern.factory.Interface;

public class ProfessionCourier implements Delivery {

	@Override
	public void deliver() {
		System.out.println("Deliver By using ProfessionCourier");
	}

}
