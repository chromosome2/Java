package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy년 MM년 dd일\n("
				+ "HH시 mm분 ss초)");
		System.out.println(sdf1.format(date));

	}

}
