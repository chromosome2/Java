package javaClass2;

public class CreditLineAccount extends Account{
	int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine=creditLine;
	}
	
	public CreditLineAccount() {
		
	}
	
	@Override
	int withdraw(int amount)throws BalanceInsfficientException{
		if((balance+creditLine)<amount) {
			throw new BalanceInsfficientException("인출이 불가능합니다.");
		}
		balance-=amount;
		return amount;
	}
}
