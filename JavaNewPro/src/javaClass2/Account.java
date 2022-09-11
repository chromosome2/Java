package javaClass2;

public class Account {
	static final String BANKNAME="��������";
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
			throw new BalanceInsfficientException("�ܾ��� �����մϴ�.("+(amount-balance)+")�� ����");
		}
		balance-=amount;
		return amount;
	}
}
