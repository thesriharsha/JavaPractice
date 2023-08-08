package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordEachLine {

	public static void main(String[] args) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you want to open");
		String file = sc.next();
		try {
		FileReader fr = new FileReader("/home/developer/files/"+file+".txt");
		BufferedReader br = new BufferedReader(fr);
		for(int i=0;i<5;i++)
		{
			String words[] = br.readLine().split(" ");
			for(var str: words)
			{
				System.out.println(str);
			}
			
		}
		fr.close();
		br.close();
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Enter a valid file name");
		}
	}
}
