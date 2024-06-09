import java.util.Scanner;
public class cashier {
	public static void main(String[] args) {
	Scanner itemScanner = new Scanner(System.in);
	System.out.print("***cashier***\n");
	System.out.print("\nPlease enter the quantity of apple ($NT 10 per unit) you purchased:");
	int qtyApple=itemScanner.nextInt();
	System.out.print("Please enter the quantity of banana ($NT 15 per unit) you purchased:");
	int qtyBanana=itemScanner.nextInt();
	System.out.print("Please enter the quantity of orange ($NT 13 per unit) you purchased:");
	int qtyOrange=itemScanner.nextInt();
	System.out.print("Please enter the quantity of kiwifruit ($NT 17 per unit) you purchased:");
	int qtyKiwi=itemScanner.nextInt();

	int total=qtyApple*10+qtyBanana*15+qtyOrange*13+qtyKiwi*17;
	System.out.print("The total cost: "+total);
	System.out.print("\nPlease enter payment amount(must above total cost):");
	int payment=itemScanner.nextInt();
	int balance=payment-total;
	System.out.print("Amount to be change: "+balance);
	int hundred=balance/100;
	int fifty=(balance-hundred*100)/50;
	int ten=(balance-hundred*100-fifty*50)/10;
	int five=(balance-hundred*100-fifty*50-ten*10)/5;
	int one=(balance-hundred*100-fifty*50-ten*10-five*5);
	System.out.printf("\nThe amount of each change is as follows:\n"+
	"$NT 100: "+hundred+"\n$NT 50: "+fifty+"\n$NT 10: "+ten+
	"\n$NT 5: "+five+"\n$NT 1: "+one);
	}
}
