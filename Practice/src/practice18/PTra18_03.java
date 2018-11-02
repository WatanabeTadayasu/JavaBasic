/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		
		ArrayList<Player> array = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){

        	while (scanner.hasNext()) {

                String line = scanner.nextLine();

                // ★ 1行ごとにArrayListに格納してください

                List<String> list = Arrays.asList(line.split(","));
             	//System.out.println(list);

             	Player p = new Player();

             	p.setPosition(list.get(0));
             	p.setName(list.get(1));
             	p.setCountry(list.get(2));
             	p.setTeam(list.get(3));

             //	System.out.println(p);
             	array.add(p);
             	
             	Iterator<Player> i = array.iterator();
                while(i.hasNext()){
                	Player u = i.next();
                   
                    if(p.getTeam().equals("レアル・マドリード")) i.remove();
                 	
             	}
                
                    
             		
             	
             	System.out.println(array); 

        	}
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } 
       
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
    ///    for(Player List : array){
    //        System.out.println(List);
   //     }

           //array.remove(0);
   //   for(int i=0;i<list.size();i++){
        
    //    if(list.get(3).equals("レアル・マドリード")) list.remove("レアル・マドリード");
        
    //    }
        
        
        //listがどんな状態か表示してみる。
      //  for(int i=0; i<array.size(); i++){
       //     System.out.println(array.get(i));
      //  }
           

		// ★ 削除後のArrayListの中身を全件出力してください

        
        
      //  System.out.println(array);
        
        
        
        
        
        
           
         //  System.out.println(array.get(0));
	}
}
