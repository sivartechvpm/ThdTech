package learn.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumOccurenceInJava {

	public static void main(String[] args) {

		int arr[] = { 1, 7, 5, 4, 3, 8, 4, 1, 2, 4, 5, 6, 8, 3, 22, 34, 5 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				int val = map.get(arr[i]);
				map.put(arr[i], ++val);
			}
		}

		int maxElementNumber = 0;
		int maxElementOccurence = 0;

		for (Entry<Integer, Integer> s : map.entrySet()) {

			if (maxElementOccurence < s.getValue()) {
				maxElementOccurence = s.getValue();
				maxElementNumber = s.getKey();
			}
		}

		System.out.println(maxElementNumber + " Occuring " + maxElementOccurence);

	}

}
