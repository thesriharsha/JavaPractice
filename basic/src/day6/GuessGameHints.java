package day6;
import java.util.*;
public class GuessGameHints {
	public static void main(String[] args)
	{
		long x = Math.round(Math.random()*10);
		long choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a whole number in the range 0 to 10");
		for(int i=3;i>0;i--)
		{
			System.out.printf("You have %d chances\n",(i));
			choice  = sc.nextLong();
			if(x==choice)
			{
				System.out.println("Hurray! You have guessed it right");
				return;
			}
			else {
				if(x<choice)
				{
					System.out.println("The number you entered is greater ");
				}
				else
				{
					System.out.println("The number you entered is lesser ");
				}
			}
		}
		System.out.println("Sorry you have failed this Game!!!");
	}
}
