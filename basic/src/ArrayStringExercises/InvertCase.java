package ArrayStringExercises;
import java.util.*;

public class InvertCase {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				s+=Character.toLowerCase(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				s+=Character.toUpperCase(str.charAt(i));
			}
		}
	System.out.println(s);
	}
}
