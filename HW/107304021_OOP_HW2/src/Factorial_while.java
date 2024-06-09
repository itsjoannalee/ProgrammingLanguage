import java.util.Scanner;
public class Factorial_while {
	public static void main(String[] args) {
		int num,result;
		Scanner numScanner=new Scanner(System.in);
		System.out.print("Please input a factorial number:");
		num= numScanner.nextInt();
		result=1;
		int i=1;
		while (i<=num) {	
			result*=i;
			i++;
		}
		System.out.printf("The result is: %d",result);
	}
}
