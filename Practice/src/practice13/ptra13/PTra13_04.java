/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero h = new Hero(25, 10, 7);
		h.setName("勇者");

		Slime s = new Slime(10, 5, 2);
		s.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		boolean attack = false;
		boolean attack1 = false;

			while(attack == false && attack1 == false) {

			h.attack();

			attack = s.damage(10);
			s.attack();

			attack1 = h.damage(5);

			// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

			if (attack == true) {
				System.out.println("勇者はスライムとの戦闘に勝利した");
			}
			if (attack1 == true) {
				System.out.println("スライムは勇者との戦闘に勝利した");
			}
			}
	}
}
/*public static void main(String[] args) {
double	x = Input.getDouble();　　　　　　　　　 …（１）数値を変数ｘに入力する
if(isZero(x)){　　　　　　　　　　　　　　　　　 …（２）ｘが０かどうかisZero(x)の戻り値でチェックする
    System.out.println("ゼロです");　　　　　　　…（３）
}else{
    System.out.println("ゼロではありません");　　…（４）
}
}

public static boolean isZero(double a){  　　　　　　…０かどうか検査する
if(a==0){　　　　　　　　　　　　　　　　　　　　…Ａ
    return true;　　　　　　　　　　　　　　　　 …Ｂ
}else{
    return false;　　　　　　　　　　　　　　　　…Ｃ
}
}*/