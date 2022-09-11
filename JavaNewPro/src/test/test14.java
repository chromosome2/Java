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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("=============================================");
			System.out.print("선택 > ");
			int choice=sc.nextInt();
			
			switch(choice) {
				case 1 :
					System.out.print("학생수 > ");
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
					System.out.println("최고 점수 : "+max);
					System.out.println("평균 점수 : "+sum/(double)students);
					break;
				default:
					run=false;
					break;
			}
		}
	}

}
