package day12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class NamesCount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("/home/developer/files/names.txt");
		BufferedReader br = new BufferedReader(fr);
		HashMap<String,Integer> hs = new HashMap<>();
		String line;
		while(true)
		{
			line=br.readLine();
		//	System.out.println(hs.entrySet());
			if(line==null)
				break;
			if(hs.containsKey(line))
			{
				hs.replace(line, hs.get(line), hs.get(line)+1);
			}
			else {
				hs.put(line, 1);
			}
		}
		System.out.println(hs);
	}
}
