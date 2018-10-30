/*
 * PTra16_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;



public class PTra16_03 {

	/*
	 * toStringメソッドをオーバーライドしてください
	 *
	 * 処理内容
	 * 	・親クラス（Objectクラス）のtoStringの処理を行ってください
	 *	・その後、改行をして「PTra16_03#toString()の処理」という文字列を連結してください
	 */
	
	public String toString() {
		return "PTra16_03#toString()の処理";
	}
	
	public static void main(String[] args) {
		
		// ★ PTra16_03クラスのtoStringメソッドの内容を出力してください
		Object o = new Object();
		String s = o.toString();
		System.out.println(s);
		
		PTra16_03 PTra = new PTra16_03();
		String s1 = PTra.toString();
		System.out.println(s1);

	}
}
