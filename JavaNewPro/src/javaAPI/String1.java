package javaAPI;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		String str="내일부터 어린이날 휴무";
		System.out.println(str);
		try {
			char ch=str.charAt(8);
			System.out.println(ch);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("주민등록번호 입력>>");
		String jumin=sc.next();
		System.out.println(jumin);
		if(jumin.length()==14) {
			if(jumin.charAt(7)=='1' || jumin.charAt(7)=='3') {
				System.out.println("남성이군요.");
			}else if(jumin.charAt(7)=='2' || jumin.charAt(7)=='4') {
				System.out.println("여성이군요.");
			}else {
				System.out.println("주민번호 입력이 잘못되었군요.");
			}
		}else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}

	}

}
