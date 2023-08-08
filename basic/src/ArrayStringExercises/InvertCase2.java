package ArrayStringExercises;

import java.util.*;

public class InvertCase2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to Invert");
		// String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(sc.nextLine());
		for (int i = 0; i < sb.length(); i++) {
			if (Character.isUpperCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			} else if (Character.isLowerCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
		}
		System.out.println(sb);
	}
}
