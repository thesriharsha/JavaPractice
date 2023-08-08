package day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class Customer {

	public static void main(String[] args) throws IOException {
		
		var data =Files.readAllLines(Path.of("/home/developer/files/customer.txt"));
		TreeMap<String,String>tm = new TreeMap<>();
		
		for(var x: data)
		{	
			String s[] = x.split(",");
			tm.put(s[0], s[1]);
		}
		for(var c: tm.entrySet())
		{
			System.out.println(c);
		}
		
	}

}
