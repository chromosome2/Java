package javaClass2;

public class Account2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		Account chulsu=new Account();
		chulsu.accountNo="000-111-22222";
		chulsu.ownerName="��ö��";
		chulsu.balance=5000;
		chulsu.deposit(300);
		System.out.println(chulsu.balance);
		Account sujin=new Account("111-222-33333","������",3000);
		try {
			System.out.println(chulsu.ownerName);
			amount=chulsu.withdraw(50000);
			System.out.println("ã�� �ݾ� : "+amount);
			System.out.println("���� �ݾ� : "+chulsu.balance);
		}catch(BalanceInsfficientException e) {
			System.out.println(e.getMessage());
			System.out.println("�ܾ� : "+chulsu.balance);
		}
	}

}
