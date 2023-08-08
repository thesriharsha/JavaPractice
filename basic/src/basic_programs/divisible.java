package basic_programs;
import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%3==0)
		{
			if (num%5==0)
			{
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		}
		else if(num%5==0)
		{
			System.out.println(3);
		}
		else {
			System.out.println(4);
		}
		
	}

}
