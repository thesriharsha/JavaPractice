package ArrayStringExercises;

import java.util.*;

public class SubString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str, substr;
		System.out.println("Enter a string");
		str = sc.nextLine();
		System.out.println("Enter a sub string");
		substr = sc.next();

		for (int i = 0; i < str.length(); i++) {
			int index = str.indexOf(substr, i);
			if (index != -1) {
				System.out.println(index);
				i = index;

			}
		}
	}

}
