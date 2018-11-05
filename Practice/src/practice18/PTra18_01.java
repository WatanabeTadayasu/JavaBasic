/*
 * PTra18_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_01 {
	

	public static void main(String[] args) {

	    // file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。
        ArrayList<String> array = new ArrayList<>();
        
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
            
        	while (scanner.hasNext()) {
        		
                String line = scanner.nextLine();
        	
                // ★ 1行ごとにArrayListに格納してください
                
             	array.add(line);
             	
        	}
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう
        
        //System.out.println(array);  arrayという一つの箱に格納
        
        for(String List : array){
            System.out.println(List);
        }
        
        /*
        	String str = "清水,山本,斉藤,高橋,渡辺";
			String[] name = str.split(",");
			for(int i=0; i<name.length; i++){
　			System.out.println(name[i]);
			}
        }*/
	
	}
}


