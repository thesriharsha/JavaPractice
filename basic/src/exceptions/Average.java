package exceptions;
import java.util.*;

public class Average {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		int sum=0,i;
		double avg;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter 10 numbers");
		for(i=0;i<a.length;i++)
		{
				try {
					System.out.println("Enter"+(i+1)+"number");
					a[i] = sc.nextInt();
					sum+=a[i];
				} catch (InputMismatchException e) {
					sc.next();
					i--;
				}	
		}
		avg = sum/i;
		System.out.println("The average is: "+avg);

	}

}
