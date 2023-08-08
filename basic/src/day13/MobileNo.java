package day13;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNo {
	public static void main(String[] args) throws Exception
	{
		//FileReader fr = new FileReader("/home/developer/files/mobileno.txt");
		
		var list = Files.readAllLines(Path.of("/home/developer/files/mobileno.txt"));
		FileWriter fw = new FileWriter("/home/developer/files/validmobile.txt");
		Pattern p = Pattern.compile("[0-9]{10}$");
		for(var num: list)
		{
			Matcher m = p.matcher(num);
			
		}
		
	}
}
