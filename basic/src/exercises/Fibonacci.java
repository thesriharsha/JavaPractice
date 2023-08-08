package exercises;

public class Fibonacci {

	public static void main(String[] args)
	{
		int a=0,b=1,i=0;
		int c;
		while(i<10)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
	}
}
