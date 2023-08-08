package day2;

import java.util.Scanner;

public class GreaterthanAvg {

	public static void main(String[] args) {
		int a[], sum = 0;
		a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int avg = sum / a.length;
		System.out.println("The elements greater than the average are");
		for (int n : a) {
			if (n > avg) {
				System.out.println(n);
			}
		}

	}
}
