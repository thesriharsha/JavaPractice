package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NamesFile {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some names [end to stop]");
		var fw = new FileWriter("/home/developer/files/names.txt",true);
		//var f = new File
		while(true)
		{
			
			String str = sc.next().toUpperCase();
			if(str.equals("END"))
			{
				break;
			}
			fw.write(str + "\n");
		}
		fw.close();

	}

}
