package day7;

import java.util.*;

public class LargestString {

	public static void main(String[] args) {

		String s = "", str;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a string");
			str = sc.nextLine();
			if (str.equals("")) {
				break;
			}
			if (str.compareToIgnoreCase(s) >= 0) {
				s = str;
			}
		}
		System.out.println("Largest string is : " + s);
	}

}
