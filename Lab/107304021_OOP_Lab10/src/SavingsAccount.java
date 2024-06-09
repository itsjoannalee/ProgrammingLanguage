
public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(double amount, int ID, double interestRate) {
		setBalance(amount);//SET
		setID(ID);//SET
		this.interestRate=interestRate;
	}
	public void setInterestRate(double rate) {
		this.interestRate=rate;
	}
	public void monthEnd() {
		//setBalance(getBalance()*(1+interestRate/100));
		deposit(getBalance()*(interestRate/100));
	}

}
