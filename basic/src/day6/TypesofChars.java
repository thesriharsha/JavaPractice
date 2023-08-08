package day6;

import java.util.Scanner;

public class TypesofChars {

	public static void main(String[] args)
	{
		String string;
		int ucount=0,lcount=0,count=0;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		char c[] = string.toCharArray();
		
		for(int i=0;i<string.length();i++)
		{
			if(Character.isDigit(string.charAt(i)))
			{
				count++;
			}
			else if(Character.isUpperCase(string.charAt(i)))
			{
				ucount++;
			}
			else if(Character.isLowerCase(string.charAt(i)))
			{
				lcount++;
			}
		}
		System.out.println("Upper case count is "+ucount);
		System.out.println("Lower case count is "+lcount);
		System.out.println("Digits count is "+count);
	}
	
}
