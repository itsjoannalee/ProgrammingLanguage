import java.util.Scanner;
public class Dismantle {
	public static void main(String[] args) {
		Scanner numScanner=new Scanner(System.in);
		System.out.print("Please enter a three-digit number:");
		int num=numScanner.nextInt();
		int hundreds=num/100;
		int ten=(num-(hundreds*100))/10;
		int unit=num-(hundreds*100)-(ten*10);
		int sum=hundreds+ten+unit;
		int product=hundreds*ten*unit;
		int difference=hundreds-ten-unit;
		System.out.printf("The sum is:"+" "+sum+"\n");
		System.out.printf("The product is:"+" "+product+"\n");
		System.out.printf("The difference is:"+" "+difference+"\n");
	
	}

}
