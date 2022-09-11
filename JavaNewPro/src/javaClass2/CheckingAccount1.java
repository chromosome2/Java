package javaClass2;

public class CheckingAccount1 {

	public static void main(String[] args) {
		CheckingAccount chulsu=new CheckingAccount("111-111","sujin",5000,"1234 5678");
		chulsu.deposit(1000);
		try {
			int paidAmount=chulsu.pay("1234 5678", 500);
			System.out.println(paidAmount);
			System.out.println(chulsu.balance);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
