package sample.gold.chap9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_3 {
	public static void main(String[] args) {
		// Windowsの場合
		Path path = Paths.get("C:\\eclipse_workspace\\Nio2_study\\src\\sample\\gold\\chap9\\ren\\9_1.txt");

		System.out.format("toString    : %s%n", path.toString());     // パスの文字列表現を返す
		System.out.format("getFileName : %s%n", path.getFileName());  // 名前要素シーケンスの最後の要素を返す
		System.out.format("getName(0)  : %s%n", path.getName(0));     // 指定したインデックスに対応するパス要素を返す
		System.out.format("getNameCount: %d%n", path.getNameCount()); // パス内の要素数を返す
		System.out.format("getRoot     : %s%n", path.getRoot());      // パスのルートを返す

		while ((path = path.getParent()) != null) {
			System.out.format("  getParent   : %s%n", path);
		}
		Path p = Paths.get("ren\\9_1.txt");
		System.out.format("getRoot     : %s%n", p.getRoot());
	}
}