package sample.gold.chap9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_5 {
	public static void main(String[] args) {
		Path path1 = Paths.get("./src/sample/gold/chap9/ren");
		System.out.format("normalize()    : %s%n", path1.normalize());
		System.out.format("toUri()        : %s%n", path1.toUri());
		System.out.format("isAbsolute     : %s%n", path1.isAbsolute());
		System.out.format(
				"toAbsolutePath : %s%n", path1.toAbsolutePath());
		Path path2 = null;
		try {
			path2 = path1.toRealPath();
			System.out.format("toRealPath() : %s%n", path2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}