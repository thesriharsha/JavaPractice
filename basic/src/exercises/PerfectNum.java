package exercises;
import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
		{
			System.out.println("It is a perfect number");
		}
		else
			System.out.println("Not a perfect number");
		
		
	}
}
