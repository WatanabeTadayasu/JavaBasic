package practice13.common;

public class Item {
	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

		private String name;
		private static int additionalDamage;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}



		public static int getAdditionalDamage() {
			return additionalDamage;
		}

		public void setAdditionalDamage(int additionalDamage) {
			Item.additionalDamage = additionalDamage;
		}

		/*Item (String name){
			this.name = name;
		}
		Item (int additionalDamage){
			this.additionalDamage = additionalDamage;
		}*/


		public Item(String name, int additionalDamage) {
			// TODO 自動生成されたコンストラクター・スタブ
		}



}
