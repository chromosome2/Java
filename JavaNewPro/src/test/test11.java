package test;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=0;
		while(true) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택> ");
			int choice=sc.nextInt();
			if (choice==1) {
				System.out.print("예금액> ");
				int inM=sc.nextInt();
				balance+=inM;
				System.out.println();
			}else if(choice==2){
				System.out.print("출금액> ");
				int outM=sc.nextInt();
				System.out.println();
				balance-=outM;
			}else if(choice==3) {
				System.out.print("잔고> "+balance);
				System.out.println();
			}else {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
