/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		String[] array = room.getCurriculum();
		
		// 取得したカリキュラム情報を全て出力してください
		//Room[] courseList = {array};
		
		for (String Curr: array){
			  System.out.println(Curr);
			}
		//System.out.print(courseList);
		
	}
}
/*JavaCourse jCourse = new JavaCourse();
DBCourse dbCourse = new DBCourse();

// ★ Course[	]の配列に jcourse と dbCourse のインスタンスを代入してください。

 Course[] courseList = {jCourse, dbCourse};

for (Course course : courseList) {
	System.out.println(course.getCourseName());
}


int data[] = {85, 72, 89};

for (int seiseki: data){
  System.out.println(seiseki);
}
*/