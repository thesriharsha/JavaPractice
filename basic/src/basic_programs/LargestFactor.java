package basic_programs;
import java.util.Scanner;

public class LargestFactor {

	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		for(int i=num/2;i>0;i--)
		{
			if(num%i==0)
			{
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
