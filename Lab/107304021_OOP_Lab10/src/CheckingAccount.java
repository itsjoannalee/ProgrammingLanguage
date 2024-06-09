
public class CheckingAccount extends BankAccount {
	private int transCount;
	
	public CheckingAccount(double amount, int ID) {
		setBalance(amount);
		setID(ID);
		transCount=0;//INITIALIZED
	}
	public void deposit(double amount) {
		transCount++;
		super.deposit(amount);
		
	}
	public void withdraw(double amount) {
		transCount++;
		super.withdraw(amount);
	}
	public void monthEnd() {
		double commissionFee=5;
		if (transCount>3) {
			withdraw(commissionFee);
			//withdraw(getBalance()*(commissionFee/100));
		}
		transCount=0;
	}

}
