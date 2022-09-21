package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		System.out.println(regExp);
		System.out.println("전화번호를 입력>>");
		String data=sc.next();
		boolean result=Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화번호 형식이 일치합니다.");
		}else {
			System.out.println("전화번호 형식과 틀립니다.");
		}
		System.out.println("이메일을 입력>>");
		String email=sc.next();
		String regExpEmail="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result=Pattern.matches(regExpEmail,email);
		if(result) {
			System.out.println("이메일주소 형식입니다.");
		}else {
			System.out.println("이메일주소 형식이 아닙니다.");
		}

	}

}
