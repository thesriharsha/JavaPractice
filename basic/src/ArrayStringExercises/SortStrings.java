package ArrayStringExercises;
import java.util.*;

public class SortStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] sentence = new String[10];
		System.out.println("Enter 10 strings");
		for(int i=0;i<sentence.length;i++)
		{
			sentence[i] = sc.next();
		}
		Arrays.sort(sentence);
		for(String s:sentence)
		{
			System.out.println(s);
		}
		
		
		
		
	}
	

}
