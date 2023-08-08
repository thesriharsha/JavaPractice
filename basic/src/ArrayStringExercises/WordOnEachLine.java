package ArrayStringExercises;
import java.util.*;

public class WordOnEachLine {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		for(String word : words)
		{
			System.out.println(word);
		}
	}

}
