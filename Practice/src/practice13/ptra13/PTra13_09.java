/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee e = new Employee();
		e.setUserNm(NAMEDATA[0]);
		e.setMail(MAILDATA[0]);
		e.setPassword(PASSDATA[0]);
		e.setDepartmentNm(QUATERDATA[0][0]);
		e.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][0]));

		Employee e1 = new Employee();
		e1.setUserNm(NAMEDATA[1]);
		e1.setMail(MAILDATA[1]);
		e1.setPassword(PASSDATA[1]);
		e1.setDepartmentNm(QUATERDATA[0][1]);
		e1.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][1]));

		Employee e2 = new Employee();
		e2.setUserNm(NAMEDATA[2]);
		e2.setMail(MAILDATA[2]);
		e2.setPassword(PASSDATA[2]);
		e2.setDepartmentNm(QUATERDATA[0][2]);
		e2.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][2]));
	}
}
