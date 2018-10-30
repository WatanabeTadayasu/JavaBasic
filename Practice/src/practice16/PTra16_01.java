package practice16;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */
    	Calendar cl = Calendar.getInstance();
        
        //SimpleDateFormatクラスでフォーマットパターンを設定する
    	
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        System.out.println(sdf.format(cl.getTime()));
    }
}

