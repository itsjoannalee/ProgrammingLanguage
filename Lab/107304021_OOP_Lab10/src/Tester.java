import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
	SavingsAccount accountA= new SavingsAccount(8000, 306049001, 1);
	SavingsAccount accountB= new SavingsAccount(1000, 306049011, 2);
	CheckingAccount accountC=new CheckingAccount(9000, 306016033);
	CheckingAccount accountD=new CheckingAccount(3000, 306016041);
	//Create an array named accounts to store all the accounts
	BankAccount[] accounts = {accountA,accountB,accountC,accountD};
	
	//BankAccount a=new BankAccount();
	Scanner inputScanner =new Scanner (System.in);
	
	String input="";
		while (input.equals("Q") == false) {
			System.out.print("D)Deposit W)Withdraw M)Month end Q)Quit:");
			input = inputScanner.nextLine();//nextLine

			if (input.equals("D")) {
				System.out.print("Enter your account number:");
				int acc = inputScanner.nextInt();
				System.out.print("Enter transaction amount:");
				int amt = inputScanner.nextInt();

				for (int i = 0; i < accounts.length; i++) {
					if (acc == accounts[i].getID()) {
						accounts[i].deposit(amt);
						System.out.printf("Balance:%.1f%n", accounts[i].getBalance());
					}			
				} 
			}else if (input.equals("W")) {
				System.out.print("Enter your account number:");
				int acc = inputScanner.nextInt();
				System.out.print("Enter transaction amount:");
				int amt = inputScanner.nextInt();

				for (int i = 0; i < accounts.length; i++) {
					if (acc == accounts[i].getID()) {
						accounts[i].withdraw(amt);
						System.out.printf("Balance:%.1f%n", accounts[i].getBalance());
					}
				}

			}else if (input.equals("M")) {	
				//要有monthEnd()才會加入利息
				for(BankAccount each:accounts) {
					each.monthEnd();
				}
				
				for(int i=0;i<accounts.length;i++) {
					System.out.printf("%d %.1f%n",i,accounts[i].getBalance());
					}
			}
			
		}
	}
}
