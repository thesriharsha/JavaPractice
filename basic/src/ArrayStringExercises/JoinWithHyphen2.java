package ArrayStringExercises;
import java.util.Scanner;
import java.util.StringJoiner;

public class JoinWithHyphen2 {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(" - ");
		Scanner sc = new Scanner(System.in);
		String str;
		while(true)
		{
			System.out.println("Enter strings [end to stop the program]");
			str = sc.next();
			if(str.equals("end"))
			{
				break;
			}
			sj.add(str);
		}
		System.out.println(sj);
	
		
	}

}
