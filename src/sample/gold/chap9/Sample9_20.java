package sample.gold.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Sample9_20 {
	public static void main(String[] args) {
		Path path = Paths.get("src/sample/gold/chap9/ren/9_20.txt");
		try {
			System.out.println(
					Files.lines(path)
							.filter(s -> s.startsWith("File"))
							.map(word -> word.length())
							.collect(Collectors.toList()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}