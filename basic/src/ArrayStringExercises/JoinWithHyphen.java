package ArrayStringExercises;
import java.util.*;

public class JoinWithHyphen {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("");
		Scanner sc = new Scanner(System.in);
		String str;
		String [] words;
		System.out.println("Enter strings");
		sb.append(sc.next());
		for(int i=0;i<sb.length();i++)
		{
			str = sc.next();
			if(str.equals("END"))
			{
				break;
			}
			else {
				sb.append("-");
				sb.append(str);
			}
		}
		System.out.println(sb);
	
	}
}
