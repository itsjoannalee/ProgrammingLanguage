import java.util.Scanner;
public class Currency {
	public static void main(String[] args) {
		Scanner  cyScanner = new Scanner(System.in);
		System.out.print("Convert from TWD, USD, JPY:");
		String currency;
		currency=cyScanner.nextLine();
		System.out.printf("Value:");
		double value=cyScanner.nextDouble();
		if (currency.equals("TWD")) {//字串不可直接用==判斷
			System.out.printf("The result:%.2f %s = %.2f USD = %.2f JPY",value,currency,value*0.034,value*3.568);
		}else if(currency.equals("USD")) {
			System.out.printf("The result:%.2f %s = %.2f TWD = %.2f JPY",value,currency,value/0.034,(value/0.034)*3.568);
		}else {
		    System.out.printf("The result:%.2f %s = %.2f TWD = %.2f USD",value,currency,value/3.568,(value/3.568)*0.034);
	    }
	}
}
