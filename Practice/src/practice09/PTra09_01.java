package practice09;
import practice09.util.Util;
/*
 * PTra09_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_01 {
	public static void main(String[] args) {
		String str = "この文字列をゆっくり表示したい";

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
		Util.dispMessageSlowly(str, 500);


	}
}

/**
 * 文字列を、1文字ずつ指定された秒数間隔をあけて表示します。
 * @param message	表示する文字列
 * @param millisecond	間隔をあけるミリ秒（1000で1秒）

public static void dispMessageSlowly(String message, long millisecond) {
	char[] array = message.toCharArray();
	for (int i = 0; i < message.length(); i++) {
		System.out.print(array[i]);
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			/* エラーが発生した場合はここにくる
		}
	}
}
*/