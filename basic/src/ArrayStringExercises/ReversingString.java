package ArrayStringExercises;
import java.util.*;

public class ReversingString {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String rev="";
		System.out.println("Enter a string to reverse");
		String str = sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}
}
