package learn.java.practice;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 12, 5, 6, 9, 7 };

		int largestElement = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (largestElement < arr[i]) {
				secondLargest = largestElement;
				largestElement = arr[i];
			} else if (secondLargest < arr[i]) {
				secondLargest = arr[i];
			}

		}

		System.out.println(secondLargest);

	}

}
