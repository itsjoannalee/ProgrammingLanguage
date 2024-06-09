import java.util.Scanner;
public class Factorial_for {
	public static void main(String[] args) {
		int num,result;
		Scanner numScanner=new Scanner(System.in);
		System.out.print("Please input a factorial number:");
		num= numScanner.nextInt();
		result=1;
		for (int i=1;i<=num;i++) {
			result*=i;
		}
		System.out.printf("The result is: %d",result);
	}

}
