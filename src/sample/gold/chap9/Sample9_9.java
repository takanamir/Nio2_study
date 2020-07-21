package sample.gold.chap9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_9 {
	public static void main(String[] args) throws java.io.IOException {
		Path p1 = Paths.get("src/sample/gold/chap9/ren/tmp");
		Files.createDirectory(p1);
		Path p2 = Paths.get("src/sample/gold/chap9/ren/tmp/x/y");
		Files.createDirectories(p2);
		Files.delete(p2);
		Files.deleteIfExists(Paths.get("src/sample/gold/chap9/ren/9_9"));
	}
}