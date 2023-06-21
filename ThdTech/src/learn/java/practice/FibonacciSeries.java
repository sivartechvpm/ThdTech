package learn.java.practice;

public class FibonacciSeries {

	// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		int thirdNumber = 0;
		for (int i = 0; i < 10; i++) {
			thirdNumber = firstNumber + secondNumber;
			System.out.println(thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}

}
