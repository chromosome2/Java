package javaClass2;

public class Car1 {

	public static void main(String[] args) {
		Car sujin=new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation=sujin.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� KumhoTire�� ��ü");
				sujin.fLT=new KumhoTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				sujin.fRT=new KumhoTire("�տ�����",12);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				sujin.bLT=new HankookTire("�ڿ���",10);
				break;
			case 4:
				System.out.println("�ڿ����� HankookTire�� ��ü");
				sujin.bRT=new HankookTire("�ڿ�����",15);
				break;
			}
			System.out.println("-------");
		}

	}

}
