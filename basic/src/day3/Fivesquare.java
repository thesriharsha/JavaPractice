package day3;
import java.util.Scanner;

public class Fivesquare {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Square [] s = new Square[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter side for square "+(i+1));
			s[i] = new Square(sc.nextInt());
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Area of square "+(i+1)+" is "+s[i].getArea());
		}
		sc.close();
}
}
