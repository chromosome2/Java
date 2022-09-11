package javaClass2;

public class Account {
	static final String BANKNAME="신한은행";
	String accountNo;
	String ownerName;
	int balance;
	
	Account(){
		
	}
	Account(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	
	int withdraw(int amount) throws BalanceInsfficientException {
		if(balance<amount) {
			throw new BalanceInsfficientException("잔액이 부족합니다.("+(amount-balance)+")원 부족");
		}
		balance-=amount;
		return amount;
	}
}
