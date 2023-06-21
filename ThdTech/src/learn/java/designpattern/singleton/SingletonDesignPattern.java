package learn.java.designpattern.singleton;

public class SingletonDesignPattern {

	private static SingletonDesignPattern singletonInstance = null;

	private SingletonDesignPattern() {

	}

	public static SingletonDesignPattern getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonDesignPattern();
		}
		return singletonInstance;
	}

	public void printHello() {
		System.out.println("Hello.I can only create single instance");
	}

}
