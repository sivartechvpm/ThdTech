package learn.java.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LandT {

	public static void main(String[] args) {

		String s = "INdia USA AUStralia china";

		Integer val = 0;

		String result = "";

		String arr[] = s.split(" ");
		
		
		List<String> ls = Arrays.asList(arr);
		
		
		
		Optional<String> strOpt=ls.stream().max(Comparator.comparing(x-> x.length()));
		System.out.println(strOpt.get());
		
		

		for (String k : arr) {

			if (k.length() > val) {
				val = k.length();
				result = k;
			}
		}

		System.out.println(result);

	}

}
