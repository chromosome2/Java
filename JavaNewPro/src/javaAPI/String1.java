package javaAPI;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		String str="���Ϻ��� ��̳� �޹�";
		System.out.println(str);
		try {
			char ch=str.charAt(8);
			System.out.println(ch);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ �Է�>>");
		String jumin=sc.next();
		System.out.println(jumin);
		if(jumin.length()==14) {
			if(jumin.charAt(7)=='1' || jumin.charAt(7)=='3') {
				System.out.println("�����̱���.");
			}else if(jumin.charAt(7)=='2' || jumin.charAt(7)=='4') {
				System.out.println("�����̱���.");
			}else {
				System.out.println("�ֹι�ȣ �Է��� �߸��Ǿ�����.");
			}
		}else {
			System.out.println("�ֹι�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
