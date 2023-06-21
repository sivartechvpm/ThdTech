package learn.java.designpattern.factory.Interface;

public class DeliveryFactory {

	public static  Delivery getDeliveryBean(String type) {
		if("Dhl".equals(type)) {
			return new Dhl();
		}
		
		if("ProfessionCourrier".equals(type)) {
			return new ProfessionCourier();
		}
		return null;
	}
}
