package practice09;
import practice09.util.Util;
/*
 * PTra09_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
		Util.shuffleArray(array);

		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください
		for(int list = 0; list <= 4; list++){
            System.out.println(list);
        } 
	}
}


/**
 * 配列の中身をシャッフルした結果を取得します。
 * @param array	シャッフルしたい配列
 * @return		シャッフルした結果の配列

public static String[] shuffleArray(String[] array) {
	List<String> list = Arrays.asList(array);
	Collections.shuffle(list);
	return (String[]) list.toArray();
}*/