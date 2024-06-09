import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.print("(Lab6)\n");
		System.out.print("Please enter a positive integer < 1000:");
		int input=inputScanner.nextInt();
	    IntegerNameConverter converter=new IntegerNameConverter(input);
	    System.out.println(converter.intName());
	    
	    System.out.print("(Bonus2)\n");
	    int num1, num2, num3;//先宣告3個變數
	    System.out.print("Please enter two numbers (seperated by space):");
	    num1=inputScanner.nextInt();
	    num2=inputScanner.nextInt();
	    Arithmetic arith1=new Arithmetic(num1,num2);
	    arith1.topTwoValue();
	    //建立max1,max2的getmethod
	    System.out.printf("The top two largest numbers are: %d, %d\n",arith1.getMax1(),arith1.getMax2());
	    System.out.printf("The average of the two numbers: %.2f\n", arith1.topTwoAvg());
	    System.out.println("The LMC of the two numbers: "+ arith1.topTwoLMC()+"\n");
	    
	    System.out.print("Please enter three numbers (seperated by space):");
	    num1=inputScanner.nextInt();//
	    num2=inputScanner.nextInt();//
	    num3=inputScanner.nextInt();
	    Arithmetic arith2=new Arithmetic(num1,num2,num3);
	    arith2.topTwoValue();
	    System.out.printf("The top two largest numbers are: %d, %d\n",arith2.getMax1(),arith2.getMax2());
	    System.out.printf("The average of the two numbers: %.2f\n", arith2.topTwoAvg());
	    System.out.println("The LMC of the two numbers: "+ arith2.topTwoLMC());
	}

}
