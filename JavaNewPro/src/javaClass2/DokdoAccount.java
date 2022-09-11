package javaClass2;

public class DokdoAccount extends Account{
	int point=0;
	public DokdoAccount (String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point=point;
	}
	
	public DokdoAccount() {
		
	};
	
	void Pdeposit(int amount) {
		deposit(amount);
		point+=(int)(amount*0.001);
	}
}
