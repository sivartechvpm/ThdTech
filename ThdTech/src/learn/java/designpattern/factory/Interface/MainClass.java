package learn.java.designpattern.factory.Interface;

public class MainClass {

	public static void main(String[] args) {

		Delivery del = DeliveryFactory.getDeliveryBean("ProfessionCourrier");
		del.deliver();
		
		
		del = DeliveryFactory.getDeliveryBean("Dhl");
		del.deliver();


	}

}
