package exercises;
import java.util.Scanner;

public class GCD {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		int min=n1;
		if(n2<n1)
			min = n2;
		for(int i=min;i>0;i--)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println("The GCD of "+n1 +" and "+ n2+" is "+ i);
				break;
			}
		}
	
	}

	}

