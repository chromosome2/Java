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
		System.out.println(year+"년 "+month+"월 "+day+"일");
		int week=date.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weeks= {"요일","일","월","화","수","목","금","토"};
		System.out.println("오늘은 "+weeks[week]+weeks[0]+"입니다.");
		int hour=date.get(Calendar.HOUR);
		int minute=date.get(Calendar.MINUTE);
		int second=date.get(Calendar.SECOND);
		int ampm=date.get(Calendar.AM_PM);
		String strAMPM=null;
		if(ampm==Calendar.AM) {
			strAMPM="오전";
		}else {
			strAMPM="오후";
		}
		System.out.println("현재 시간은 "+strAMPM+" "+hour+"시 "+minute+"분 "+second+"초");
		int test=date.get(Calendar.WEDNESDAY);
		System.out.println(test);

	}

}
