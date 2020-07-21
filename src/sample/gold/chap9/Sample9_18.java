package sample.gold.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_18 {
	public static void main(String[] args) {
		Path path = Paths.get("src/sample/gold/chap9/ren/9_XX");
		try {
			Files.list(path).forEach(System.out::println);
			System.out.println();
			Files.list(path)
					.filter(s -> !Files.isDirectory(s))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}