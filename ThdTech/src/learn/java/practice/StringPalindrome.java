package learn.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {

	public static void main(String[] args) throws IOException {

		// MADAM
		// civic, radar, level, rotor, kayak, madam
		// noon, civic, racecar, level, and mom

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Integer i = (input.length()) / 2;
		boolean isPalindrome = true;
		for (int k = 0; k < i; k++) {
			if (input.charAt(k) != input.charAt(input.length() - 1 - k)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Its Palindrome String");
		} else {
			System.out.println("Its not Palindrome");
		}

	}

}
