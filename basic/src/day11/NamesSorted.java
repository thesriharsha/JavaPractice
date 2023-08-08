package day11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NamesSorted {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("/home/developer/files/names.txt");
		System.out.println("Enter names [end to stop]");
		var names = new ArrayList<String>();
		while(true)
		{
			String str = sc.next();
			if(str.equals("end"))
				break;
			names.add(str);
		}
		names.sort(null);
		for(String s: names)
		{
			fw.write(s+"\n");
		}
		fw.close();
	}

}
