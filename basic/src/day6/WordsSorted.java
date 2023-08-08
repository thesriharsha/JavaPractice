package day6;
import java.util.*;


public class WordsSorted {

	public static void main(String[] args)
	{
		String string;
		//String[] words = new String[20];
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		String[] words = string.split(" ");
		Arrays.sort(words);
		
		for(String s:words)
		{
			System.out.println(s);
		}
	}
}
