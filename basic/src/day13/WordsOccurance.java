package day13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsOccurance {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		var data = Files.readAllLines(Path.of("/home/developer/files/words.txt"));
		Pattern p = Pattern.compile("\\w+");
		var map = new TreeMap<String,Integer>();
		String word;
		for(var line: data)
		{
			
			Matcher m = p.matcher(line);
			while(m.find())
			{
				word = m.group();
				if(map.containsKey(word))
					map.replace(word,map.get(word)+1);
				else
					map.put(word, 1);
			}
		}
		System.out.println(map);
	}

}
