package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;


public class NonBlankLines {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file to open");
		String file = sc.next();
		
		FileReader fr;
		try {
			fr = new FileReader("/home/developer/files/"+file+".txt");
			 
			 BufferedReader br = new BufferedReader(fr);
			 LineNumberReader lnr = new LineNumberReader(br);
			
			 int i=1;
			 while(true)
			 {
				 String str = br.readLine();
				 if(str==null)
				 {
					 break;
				 }
				 if(!str.isBlank())
				 {
				 System.out.print(lnr.getLineNumber());
				 System.out.println(str);
				 }
			 }
				 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found check the name");
		}
	}
	

}
