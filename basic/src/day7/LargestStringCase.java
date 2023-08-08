package day7;
import java.util.*;

public class LargestStringCase {

		public static void main(String[] args) {

			String s = "", str;
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Enter a string");
				str = sc.nextLine();
				if (str.equals("")) {
					break;
				}
				if (str.compareTo(s) >= 0) {
					s = str;
				}
			}
			System.out.println("Largest string is : " + s);
		}

	}