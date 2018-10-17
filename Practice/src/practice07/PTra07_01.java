package practice07;
/*
 * PTra07_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_01 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言してください
		int[] arrey;

		// ★ 変数arrayの配列を5個の領域で確保してください
		arrey = new int[5];

		// ★ 変数arrayにそれぞれ、[1,4,7,10,13] を代入してください
		arrey[0] = 1;
		arrey[1] = 4;
		arrey[2] = 7;
		arrey[3] = 10;
		arrey[4] = 13;

		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		System.out.println(arrey[0]);
		System.out.println(arrey[1]);
		System.out.println(arrey[2]);
		System.out.println(arrey[3]);
		System.out.println(arrey[4]);
	}
}
