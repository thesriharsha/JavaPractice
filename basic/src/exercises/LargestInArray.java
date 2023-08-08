package exercises;
import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args)
	{
		int a[]= new int[10];
		int max=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 10 array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
	System.out.println("The maximum element is "+ max);
	}
}
