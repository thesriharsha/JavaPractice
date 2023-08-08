package day7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NumberofDays {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date1");
		LocalDate d1 = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println("Enter date2");
		LocalDate d2 = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println(ChronoUnit.DAYS.between(d1, d2));
		
	}
}
