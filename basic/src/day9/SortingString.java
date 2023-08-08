package day9;

import java.util.Arrays;
import java.util.Comparator;

class LengthCheck implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.length() - s2.length();
	}

}

public class SortingString {

	public static void main(String[] args) {
		String s[] = { "Harsha", "Vani", "Bharath Ram", "Chala gaali" };
		Arrays.sort(s, new LengthCheck());
		for (var str : s) {
			System.out.println(str);
		}

	}

}
