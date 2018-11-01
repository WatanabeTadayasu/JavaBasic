/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		
		 Player p = new Player();
	
		 
	        
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
	            
	        	while (scanner.hasNext()) {
	        		
	                String line = scanner.nextLine();
	                
	                String[] ArrayList = line.split("3");
	                
	                p.setPosition(ArrayList[0]);
	    			p.setName(ArrayList[1]);
	    			p.setCountry(ArrayList[2]);
	    			p.setTeam(ArrayList[3]);
	               
	             	
	        	}
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }
	        
	        //for(String List : array){
	          //  System.out.println(List);
	      //  }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
	        
	        
	       
	        
	        
	        p.toString();
	}

	}

