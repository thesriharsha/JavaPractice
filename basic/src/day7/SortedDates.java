package day7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SortedDates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDate[] ld = new LocalDate[5]; 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		System.out.println("Enter 5 dates in format dd-mm-yyyy");
		for(int i=0;i<ld.length;i++)
		{
			LocalDate d = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-uuuu"));
			ld[i] = d;
		}
		Arrays.sort(ld);
		for(LocalDate i: ld)
		{
			System.out.println(i.format(format));
		}
	}

}
