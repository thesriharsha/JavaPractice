package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RollNo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll no of Student");
		String roll = sc.next();
		FileReader fr = new FileReader("/home/developer/files/roll.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true)
		{
			String line = br.readLine();
			if(line==null)
				break;
			String words[] = line.split(",");
			if(words[0].equals(roll))
			{
				System.out.println(roll+" got "+words[1]+" marks");
				break;
			}
			
		}
	}

}
