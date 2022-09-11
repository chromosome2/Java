package javaClass2;

public class Car1 {

	public static void main(String[] args) {
		Car sujin=new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation=sujin.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 KumhoTire로 교체");
				sujin.fLT=new KumhoTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				sujin.fRT=new KumhoTire("앞오른쪽",12);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				sujin.bLT=new HankookTire("뒤왼쪽",10);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire로 교체");
				sujin.bRT=new HankookTire("뒤오른쪽",15);
				break;
			}
			System.out.println("-------");
		}

	}

}
