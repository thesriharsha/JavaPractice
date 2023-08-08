package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class UniqueLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashSet hs1 = new HashSet<String>();
		HashSet hs2 = new HashSet<String>();
		FileReader f1 = new FileReader("J:\\names1.txt");
		FileReader f2 = new FileReader("J:\\names2.txt");
		
		BufferedReader br = new BufferedReader(f1);
		while(true)
		{
			String name = br.readLine();
			if(name==null)
				break;
			hs1.add(name);
		}
		br= new BufferedReader(f2);
		while(true)
		{
			String name = br.readLine();
			if(name==null)
				break;
			hs2.add(name);
		}
		
		hs1.addAll(hs2);
		System.out.println(hs1);
	}

}
