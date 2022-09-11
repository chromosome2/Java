package javaClass2;

public class CreditLineAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditLineAccount sundal=new CreditLineAccount("111-111","sundal",100,100000);
		sundal.deposit(500);
		try {
			int a=sundal.withdraw(60000);
			System.out.println(a);
			System.out.println(sundal.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
