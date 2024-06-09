import java.util.Scanner;
public class HCF {
	public static void main(String[] args) {
		int  num1, num2, max;
		Scanner numScanner = new Scanner(System.in);
		System.out.print("Please input two integer numbers:");
		num1=numScanner.nextInt();
		num2=numScanner.nextInt();
		max=1;
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		//在for迴圈之外將結果列印出來
		System.out.printf("Result: the least common multiple is %d",max);
	}
}
