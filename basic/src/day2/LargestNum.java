package day2;

public class LargestNum {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("No numbers given");
			return;
		}
		int max = 0;
		for (int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);
			if (n > max)
				max = n;
		}
		System.out.println("The maximum element is " + max);
	}
}
