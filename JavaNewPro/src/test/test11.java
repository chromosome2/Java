package test;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=0;
		while(true) {
			System.out.println("=============================");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("=============================");
			System.out.print("����> ");
			int choice=sc.nextInt();
			if (choice==1) {
				System.out.print("���ݾ�> ");
				int inM=sc.nextInt();
				balance+=inM;
				System.out.println();
			}else if(choice==2){
				System.out.print("��ݾ�> ");
				int outM=sc.nextInt();
				System.out.println();
				balance-=outM;
			}else if(choice==3) {
				System.out.print("�ܰ�> "+balance);
				System.out.println();
			}else {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
