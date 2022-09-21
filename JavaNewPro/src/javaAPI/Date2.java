package javaAPI;

import java.time.LocalDate;

public class Date2 {

	public static void main(String[] args) {
		LocalDate currentDate1=LocalDate.of(2020, 1, 1);
		if(currentDate1.isLeapYear()) {
			System.out.println("올해는 윤년입니다. 2월달이 29일까지 있습니다.");
		}else {
			System.out.println("올해는 평년입니다. 2월달이 28일까지 있습니다.");
		}
		
		

	}

}
