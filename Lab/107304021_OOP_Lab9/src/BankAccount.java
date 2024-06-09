
public class BankAccount {
	private int ID;
	private double balance;
	
	public BankAccount(int ID, double balance) {
		this.ID=ID;
		this.balance=balance;
	}
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
	public double getBalance() {
		return this.balance;
	}

}
