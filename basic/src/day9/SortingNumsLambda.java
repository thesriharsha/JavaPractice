package day9;

import java.util.Arrays;

public class SortingNumsLambda {

	public static void main(String[] args)
	{
		String s[] = {"AB123", "XY3","PQ286","DE12"};
		
		Arrays.sort(s, (s1,s2)-> Integer.parseInt(s1.substring(2))- Integer.parseInt(s2.substring(2)));
		for(var str: s)
		{
			System.out.println(str);
		}
	}
}
