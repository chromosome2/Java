package javaAPI;

import java.time.LocalDate;

public class Date2 {

	public static void main(String[] args) {
		LocalDate currentDate1=LocalDate.of(2020, 1, 1);
		if(currentDate1.isLeapYear()) {
			System.out.println("���ش� �����Դϴ�. 2������ 29�ϱ��� �ֽ��ϴ�.");
		}else {
			System.out.println("���ش� ����Դϴ�. 2������ 28�ϱ��� �ֽ��ϴ�.");
		}
		
		

	}

}
