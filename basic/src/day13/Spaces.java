package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spaces {

	public static void main(String[] args) throws Exception{
		
		FileReader fr  = new FileReader("/home/developer/files/spaces.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line= br.readLine())!=null)
		{
			Pattern p = Pattern.compile(" +");
			Matcher m = p.matcher(line);
			line = m.replaceAll(" ");
			System.out.println(line);
		}
		
		fr.close();
		br.close();
	}

}
