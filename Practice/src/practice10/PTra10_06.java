package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		
		final int distance = 300;
		
		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 60;
		
		int sum = 0;
		//int n = 0;
		
		for(int n = 0; n < 61; n ++) {
		//while (n >= 51) {
			
			//n ++;
			
			int random = car1.run();
			
			if(random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
			
			sum += random;
		
			if(sum >= 300) {
				
				//int sum = (n*number);
				int x = 60 - n;
				
				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
				break;
			}
		}
		
		
		Car car2 = new Car();
		car2.color = "blue";
		car2.gasoline = 70;
		
		int sum1 = 0;
		//int n = 0;
		
		for(int n = 0; n < 71; n ++) {
		//while (n >= 51) {
			
			//n ++;
			
			int random = car2.run();
			
			if(random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
			
			sum1 += random;
		
			if(sum1 >= 300) {
				
				//int sum = (n*number);
				int x = 70 - n;
				
				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
				break;
			}
		}
		
		Car car3 = new Car();
		car3.color = "blue";
		car3.gasoline = 80;
		
		int sum2 = 0;
		//int n = 0;
		
		for(int n = 0; n < 81; n ++) {
		//while (n >= 51) {
			
			//n ++;
			
			int random = car3.run();
			
			if(random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
			
			sum2 += random;
		
			if(sum2 >= 300) {
				
				//int sum = (n*number);
				int x = 80 - n;
				
				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
				break;
			}
		}
		
	}
}
