package sample.gold.chap9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_4 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\eclipse_workspace\\Nio2_study\\src\\sample\\gold\\chap9\\ren\\9_1.txt");
		System.out.format("1-4     : %s%n", path.subpath(1, 4)); // Nio2_study\src\sample
		System.out.format("0-2     : %s%n", path.subpath(0, 2)); // eclipse_workspace\Nio2_study
//		System.out.format("0-9     : %s%n", path.subpath(0,9)); // IllegalArgumentException
//		System.out.format("2-2     : %s%n", path.subpath(2,2)); // IllegalArgumentException
	}
}