package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy�� MM�� dd��\n("
				+ "HH�� mm�� ss��)");
		System.out.println(sdf1.format(date));

	}

}
