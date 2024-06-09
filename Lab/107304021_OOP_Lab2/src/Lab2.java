import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int num1,num2;
	Scanner numScanner = new Scanner(System.in);
	System.out.print("Please input two number(use space to split):");
	num1 = numScanner.nextInt();
	num2 = numScanner.nextInt();
	int Sum = num1+num2;
	System.out.printf("Sum: %d\n", Sum);
	int Mul = num1*num2;
	System.out.printf("Mul: %d\n", Mul);
	//way1
	double Avg =(double)(num1+num2)/2;
	System.out.printf("Avg: %.1f\n", Avg);
	//way2
	double Avg2 = (num1+num2)/(2.0);
	System.out.printf("Avg: %.1f\n", Avg2);
	
	System.out.printf("Max: %d\n",Math.max(num1, num2));
	//2
	String fullName="Joanna L"
			+ "ee";
	System.out.print(fullName);
	System.out.print(" "+fullName.length());
	System.out.print("\n"+fullName.substring(7)+"\n");
	//3
	int remain1 = num1%2; 
	int remain2 = num2%2;
	if(remain1==1&&remain2==1) {
		 System.out.printf("Both %d and %d are odd.\n", num1,num2);
	}
	else if(remain1==1&&remain2==0){
		System.out.printf("%d is odd, %d is even.\n",num1,num2);
	}
	else if(remain1==0&&remain2==1){
		System.out.printf("%d is even, %d is odd.\n",num1,num2);
	}
	else {
		System.out.printf("Both %d and %d are even.\n", num1,num2); 
	}
	}
}