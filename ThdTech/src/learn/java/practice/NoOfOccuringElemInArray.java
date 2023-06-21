package learn.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfOccuringElemInArray {

	public static void main(String[] args) {

		//a=0,1,1,1,1,2,2,5,2,1,0,0,3,2
		
		List<Integer> input  = Arrays.asList(0,1,1,1,1,2,2,5,2,1,0,0,3,2);
		
		
		Map<Object,Object> map = new HashMap<>();
		
		//Without Java 8
		
		for(Integer i: input) {
			if(map.get(i)==null) {
				map.put(i, 1);
			}else {
				Integer val = (Integer) map.get(i);
				map.put(i, ++val);
			}
		}
		System.out.println(map);
		
		
		
		//------------------------------------------------------------------------------------------
		
		//Java 8
		
		Map<Object, Long> counts =
				input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(counts);
		
		
		
		List<Integer> inputs = Arrays.asList(100, 9, 8, 200);
		inputs.stream().map(e -> e*e).filter(x -> x < 100).forEach(x -> {
			System.out.println(x);
		});
		
		
		
	}

}
