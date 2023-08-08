package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayLines {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you want to open");
		String file = sc.next();
		FileReader fr ;
		BufferedReader br;
		try {
		 fr = new FileReader("/home/developer/files/"+file+".txt");
		 br = new BufferedReader(fr);
		while(true)
		{
			var line = br.readLine();
			if(line==null)
				break;
			
			if(line.length()>10)
			{
				System.out.println(line);
			}
			
		}
		br.close();
		fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Enter a valid file name");
		}
		
	}
}
