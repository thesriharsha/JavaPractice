package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MarksException {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the name of the files containing marks");
		Scanner sc = new Scanner(System.in);
		String line,name;

		String file = sc.next();
		try 
		{	
			FileReader fr= new FileReader("/home/developer/files/"+file+".txt");
			BufferedReader br = new BufferedReader(fr);
			while(true)
			{
				line = br.readLine();
				if(line==null)
				{
					break;
				}
				if(line.isBlank())
				{
					continue;
				}
				try
				{
				String words[] = line.split(",");
				name = words[0];
				int total=0;
				for(int i=1;i<words.length;i++)
				{
					total += Integer.parseInt(words[i]);
				}
				System.out.println(name+" got "+total+" marks");
				}
				catch(NumberFormatException n)
				{
					System.err.println("The marks are not in the right format Please check!");
				}
			}
			
		}
		
		catch(FileNotFoundException e)
		{
			System.err.println("File not Found Please check the file name!");
		}
//		br.close();
//		fr.close();
		
	}
}
