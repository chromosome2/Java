package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		System.out.println(regExp);
		System.out.println("��ȭ��ȣ�� �Է�>>");
		String data=sc.next();
		boolean result=Pattern.matches(regExp, data);
		if(result) {
			System.out.println("��ȭ��ȣ ������ ��ġ�մϴ�.");
		}else {
			System.out.println("��ȭ��ȣ ���İ� Ʋ���ϴ�.");
		}
		System.out.println("�̸����� �Է�>>");
		String email=sc.next();
		String regExpEmail="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result=Pattern.matches(regExpEmail,email);
		if(result) {
			System.out.println("�̸����ּ� �����Դϴ�.");
		}else {
			System.out.println("�̸����ּ� ������ �ƴմϴ�.");
		}

	}

}
