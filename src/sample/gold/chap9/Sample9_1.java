package sample.gold.chap9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_1 {
	public static void main(String[] args) {
		Path path1 = Paths.get("ren/9_1.txt");
		Path path2 = Paths.get("C:\\eclipse_workspace\\Nio2_study\\src\\sample\\gold\\chap9\\ren\\9_1.txt");
		Path path3 = Paths.get("C:", "eclipse_workspace" , "Nio2_study", "src", "sample", "gold", "chap9", "ren", "9_1.txt");
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
	}
}