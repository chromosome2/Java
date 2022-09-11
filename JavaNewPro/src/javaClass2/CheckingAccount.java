package javaClass2;

public class CheckingAccount extends Account{
	String cardNo;
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo=cardNo;
	}
	
	public CheckingAccount() {
		
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo)) {
			throw new Exception("ī���ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		return withdraw(amount);
	}
}
