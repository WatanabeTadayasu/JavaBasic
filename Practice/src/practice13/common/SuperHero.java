package practice13.common;

public class SuperHero extends Hero {

	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */

	private Item equipment;

	public SuperHero(int hp, int power, int endurance) {
		super(25, 10, 7);
	}



	/*public int attack() {
		return this.power;
	}*/

	public SuperHero() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}



	public int attack() {
		return getPower() + Item.getAdditionalDamage();
	}



	public Item getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
}
