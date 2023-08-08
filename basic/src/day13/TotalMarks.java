package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalMarks {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\d+");
		FileReader fr = new FileReader("/home/developer/files/totalmarks.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int sum =0;
		while(true)
		{
			line = br.readLine();
			if(line==null)
				break;
			Matcher match = p.matcher(line);
			while(match.find())
			{
				sum+= Integer.parseInt(match.group());
			}
		}
		System.out.println(sum);
		br.close();
		fr.close();
		
	}

}
