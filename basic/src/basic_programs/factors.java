package basic_programs;
import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check its factors");
		int num = sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
