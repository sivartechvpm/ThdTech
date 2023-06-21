package learn.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingInJava {

	public static void main(String[] args) {

		
		List<Integer> li = Arrays.asList(3,4,2,1,5,9,7,4);
		
		li.stream().sorted().forEach(System.out::println);
		
		
		
		
		
	}

}
