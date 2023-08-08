package day12;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSort {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1,String s2) {
				if(s1.length()==s2.length())
					return 1;
				return s1.length()-s2.length();
			}
		});
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names [end to stop]");
		while(true)
		{
			String str= sc.next();
			if(str.equals("end")) 
				break;
			
			ts.add(str);
		}
		System.out.println(ts);
	}

}
