package test;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		Scanner sc=new Scanner(System.in);
		int[] scores= null;
		int students=0;
		while(run) {
			System.out.println("=============================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("=============================================");
			System.out.print("���� > ");
			int choice=sc.nextInt();
			
			switch(choice) {
				case 1 :
					System.out.print("�л��� > ");
					students=sc.nextInt();
					scores=new int[students];
					break;
				case 2 :
					for(int i=0; i<students; i++) {
						System.out.print("scores["+i+"] > ");
						scores[i]=sc.nextInt();
					}
					break;
				case 3 :
					for(int i=0; i<students; i++) {
						System.out.println("scores["+i+"] : "+scores[i]);
					}
					break;
				case 4 :
					int max=0;
					int sum=0;
					for(int i=0; i<students; i++) {
						if(max<scores[i]) {
							max=scores[i];
						}
						sum+=scores[i];
					}
					System.out.println("�ְ� ���� : "+max);
					System.out.println("��� ���� : "+sum/(double)students);
					break;
				default:
					run=false;
					break;
			}
		}
	}

}
