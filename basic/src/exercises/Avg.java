package exercises;
import java.util.Scanner;

public class Avg {
	
	static double avg(int ...arr)
	{
		int count=0,sum=0;
		for(int n: arr)
		{
			sum+=n;
			count++;
		}
		return sum/count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(avg(10,20,30,40,50,10,2));
	}

}
