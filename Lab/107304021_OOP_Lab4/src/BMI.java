import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner valueScanner = new Scanner(System.in);
		System.out.print("Please input the weight(kg):");
		double weight=valueScanner.nextInt();
		System.out.print("Please input the height(cm):");
		double height = valueScanner.nextInt();
		height = height/100;
		double bmi=weight/Math.pow(height, 2);
		System.out.printf("Your BMI is: %.2f",bmi);
		if (bmi<18.5) {
			 System.out.println("\nThe result is: underweight");
		 }else if (bmi>24) {
			 System.out.println("\nThe result is: overweight");
		 }else {
			 System.out.println("\nThe result is: normal");
		 }
		
	}

}
