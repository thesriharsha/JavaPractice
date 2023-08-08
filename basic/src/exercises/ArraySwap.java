package exercises;
import java.util.Scanner;

public class ArraySwap {
	
	public static void main(String[] args)
	{
		int a[] = new int[10];
		int temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 10 array elements");
		int len = a.length;
		for(int i=0;i<len;i++)
		{
			a[i]= sc.nextInt();
			
		}
		int index = len/2;
		for(int i=0;i<len/2;i++)
		{
			temp = a[i];
			a[i]= a[index];
			a[index++] = temp;
		}
		for(int n: a)
		{
			System.out.println(n);
		}
	}
}
