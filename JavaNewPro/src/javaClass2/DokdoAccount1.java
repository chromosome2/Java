package javaClass2;

public class DokdoAccount1 {

	public static void main(String[] args) {
		DokdoAccount sujin=new DokdoAccount("111-111","sujin",0,0);
		sujin.Pdeposit(20000);
		System.out.println("���������� : "+sujin.point);
		System.out.println("�ܾ� : "+sujin.balance);

		sujin.Pdeposit(30000);
		System.out.println("���������� : "+sujin.point);
		System.out.println("�ܾ� : "+sujin.balance);
		

	}

}
