package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

public class Calendar1 {

	public static void main(String[] args) {
		TimeZone tz=TimeZone.getTimeZone("America/New_York");
		Calendar date=Calendar.getInstance(tz);
		System.out.println(date);
		Calendar date1=Calendar.getInstance();
		System.out.println(date1);
		int year=date.get(Calendar.YEAR);
		System.out.println(year);
		int month=date.get(Calendar.MONTH)+1;
		int day=date.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"�� "+month+"�� "+day+"��");
		int week=date.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weeks= {"����","��","��","ȭ","��","��","��","��"};
		System.out.println("������ "+weeks[week]+weeks[0]+"�Դϴ�.");
		int hour=date.get(Calendar.HOUR);
		int minute=date.get(Calendar.MINUTE);
		int second=date.get(Calendar.SECOND);
		int ampm=date.get(Calendar.AM_PM);
		String strAMPM=null;
		if(ampm==Calendar.AM) {
			strAMPM="����";
		}else {
			strAMPM="����";
		}
		System.out.println("���� �ð��� "+strAMPM+" "+hour+"�� "+minute+"�� "+second+"��");
		int test=date.get(Calendar.WEDNESDAY);
		System.out.println(test);

	}

}
