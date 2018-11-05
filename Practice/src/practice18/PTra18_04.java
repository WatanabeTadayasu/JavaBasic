/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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
                // 配列をリストに変換
            //  List<String> list = new ArrayList<String>(Arrays.asList(arr_1));
                List<String> list = Arrays.asList(line.split(","));

             	//System.out.println(list);

             	Player p = new Player();

             	p.setPosition(list.get(0));
             	p.setName(list.get(1));
             	p.setCountry(list.get(2));
             	p.setTeam(list.get(3));
             	//System.out.println(p);

             	array.add(p);
             	//System.out.println(array);

        	}
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        //  ListはインターフェイスでArrayListは実装クラス
        

        Collections.shuffle(array);//要素をシャッフル

        int sum = 0;

        for(int e = 0; e < array.size(); e++){

			if(array.get(e).getPosition().equals("GK") && sum <= 0) {

				System.out.println(array.get(e));

            	sum ++;

            }

        }

        for(int e = 0; e < array.size(); e++){
        
			if(array.get(e).getPosition().equals("DF") && sum <= 4) {

				System.out.println(array.get(e));

            	sum ++;
            }

        }
        
        for(int e = 0; e < array.size(); e++){
            
			if(array.get(e).getPosition().equals("MF") && sum <= 8) {

				System.out.println(array.get(e));

            	sum ++;
            }

        }
        
        for(int e = 0; e < array.size(); e++){
            
			if(array.get(e).getPosition().equals("FW") && sum <= 10) {

				System.out.println(array.get(e));

            	sum ++;
            }

        }

	}

}

      //  System.out.println(array.get(e));

       /* 
         
         int sum = 0;                                                                                                                               
				
				for(int j = 0; j < array.length; j ++) {
					
					System.out.print((j + 1) + "年目: ");
					
					int sumYear = 0;
					
					for(int i = 0; i < array[j].length; i ++) {
						
						System.out.print(array[j][i] + " ");
						
						sumYear += array[j][i];
					
					}
					
					System.out.println("合計: " + sumYear);
					
					sum += sumYear;
				
				}
				
				System.out.println("総計: " + sum);
            
            */
