/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

		
		
		
		String[] arayy = {"ス","ッ","キ","リ","わ","か","る","J","a","v","a","入","門"};
		
		
		for(int i = 0; i < arayy.length; ++i) {
		    for(int j = 0; j < arayy[i].length(); ++j) {
		        System.out.print(arayy[i]);   

		        try {
		            Thread.sleep(100);
		        }
		        catch(InterruptedException e) {
		            e.printStackTrace();
		        }
		    }
		  
		}
	}

	}