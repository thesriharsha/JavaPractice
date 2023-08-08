package day9;

import java.util.*;
public class SortingWithNums {

	public static void main(String[] args) {
		
		String s[] = {"AB123", "XY3","PQ286","DE12"};
		int a[] = new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			a[i] = Integer.parseInt(s[i].substring(2));
		}
		Arrays.sort(a);
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(Integer.toString(a[i]).equals(s[j].substring(2)))
				{
					System.out.println(s[j]);
					s[j] = "00O";
					break;
				}
			}
		}

	}

}
