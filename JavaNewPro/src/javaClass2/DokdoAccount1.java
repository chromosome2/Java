package javaClass2;

public class DokdoAccount1 {

	public static void main(String[] args) {
		DokdoAccount sujin=new DokdoAccount("111-111","sujin",0,0);
		sujin.Pdeposit(20000);
		System.out.println("µ¶µµ»ç¶û±â±Ý : "+sujin.point);
		System.out.println("ÀÜ¾× : "+sujin.balance);

		sujin.Pdeposit(30000);
		System.out.println("µ¶µµ»ç¶û±â±Ý : "+sujin.point);
		System.out.println("ÀÜ¾× : "+sujin.balance);
		

	}

}
