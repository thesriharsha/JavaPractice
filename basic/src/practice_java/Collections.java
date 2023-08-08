package practice_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
//		Arrays.stream(nums);
	nums.stream().forEach(System.out::println);
	
		
//		nums.add(5);
//		nums.add(0, 2);
////		?nums.

		LinkedHashMap<Integer, String> map= new LinkedHashMap<>();
		map.put(4,"bharath");
		
		HashSet<Integer> s = new HashSet<>();
		s.add(null);
		
//		s.add(8);
//		s.add(0);
		System.out.println(s);
		
		
		
		}
}
