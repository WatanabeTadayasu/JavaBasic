/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
             	
        	}
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

        	for(Player List : array){
         	System.out.println(List);
        	}

    //      System.out.println(array.get(0));

	}

	}

