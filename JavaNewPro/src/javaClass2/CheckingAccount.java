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
			throw new Exception("카드번호가 일치하지 않습니다.");
		}
		return withdraw(amount);
	}
}
