package learn.java.practice;

public class Altimetrik {

	public static void main(String[] args) {

		// Employeeeee emp = Employeeeee.getInstance();

	}

}

class Employeee {

	static Employeee instance;

	private Employeee() {

	}

	static synchronized Employeee getInstance() {

		if (instance == null) {

			synchronized (Employeee.class) {
				instance = new Employeee();
			}

		}

		return instance;

	}

}
