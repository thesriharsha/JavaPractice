package day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class Top5Marks {
	public static void main(String[] args) throws IOException {

		var number = Files.lines(Path.of("/home/developer/files/topmarks"));
	
		number.map(s -> Integer.parseInt(s))
		.sorted(Comparator.reverseOrder()).
		limit(5)
				.forEach(System.out::println);
	}

}