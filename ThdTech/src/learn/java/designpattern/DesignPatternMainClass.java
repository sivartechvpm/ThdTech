package learn.java.designpattern;

import java.util.Collections;
import java.util.HashMap;

import learn.java.designpattern.factory.Vehicle;
import learn.java.designpattern.factory.VehicleFactory;
import learn.java.designpattern.singleton.SingletonDesignPattern;

public class DesignPatternMainClass {

	public static void main(String[] args) {

		
 // CREATIONAL DESIGN PATTERN
 // -------------------------------------------------------------------------------------------------------------------------------------------------		
		// Singleton Design Pattern 
		SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
		instance.printHello();
		
		
		//---------------------------------------------------------------------------------------------------------------------
		//Factory Design Pattern
		Vehicle twoWheeler = VehicleFactory.getInstance("two", 2);
		System.out.println(twoWheeler);

		Vehicle fourWheeler = VehicleFactory.getInstance("four", 4);
		System.out.println(fourWheeler);

		//---------------------------------------------------------------------------------------------------------------------
		
		//Collections.synchronizedMap(new HashMap<>());
		
		
	}

}
