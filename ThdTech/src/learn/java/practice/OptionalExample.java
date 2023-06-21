package learn.java.practice;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String lowercaseString = "";
		String[] str = new String[10];
		// lowercaseString = str[5].toLowerCase();
		System.out.print(lowercaseString);

		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			
			

			// check for value is present or not
			lowercaseString = str[0].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("string value is not present");
	}

}
