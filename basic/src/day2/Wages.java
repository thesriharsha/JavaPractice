package day2;

import java.util.Scanner;

public class Wages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, no_of_hrs;
		double wage;
		System.out.println("Enter the day of the week");
		day = sc.nextInt();
		System.out.println("Enter number of hours worked");
		no_of_hrs = sc.nextInt();
		switch (day) {
		case 1, 2, 3:
			wage = 100 * no_of_hrs;
			break;
		case 4, 5:
			wage = 125 * no_of_hrs;
			break;
		case 6:
			wage = 150 * no_of_hrs;
			break;
		case 7:
			wage = 200 * no_of_hrs;
			break;
		default:
			wage = 0;
		}
		if (wage > 1000) {
			wage += wage * 0.1;
		}
		System.out.print(wage);
		sc.close();
	}

}
