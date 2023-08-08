package practice_java;

import java.util.Arrays;
import java.util.List;

public class common_in_3arrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {3,6,8,9,1};
		int c[] = {1,4,5,3,6};
		
		List l = Arrays.stream(a).anyMatch(Arrays.stream(b))
		
	}
}
