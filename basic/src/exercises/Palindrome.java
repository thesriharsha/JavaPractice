package exercises;

public class Palindrome {

	public static void main(String[] args)
	{
		int rem,temp;
		for(int i=1000;i<=2000;i++)
		{	int rev=0;
			temp=i;
			while(temp>0)
			{
				rem = temp%10;
				rev= rev*10+ rem;
				temp/=10;
			}
			if(rev==i)
			{
				System.out.println(i);
			}
		}
	}
}
