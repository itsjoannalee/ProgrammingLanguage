
public class BankAccount {
	private int ID;
	private double balance;
	
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public void setBalance(double amount) {
		this.balance=amount;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if (balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("Your account does not have enough money.");
		}
	}
	public void monthEnd() {
		
	}
	public double getBalance() {
		return balance;
	}

}
