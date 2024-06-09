import java.util.Scanner;
public class abc {
	public static void main(String[] args) {
		System.out.println(Math.max(Math.max(5,6),3));
		//ex
		int x=5;
		int y=8;
		x=x+1;
		y=y-3;
		System.out.println(Math.max(x,y));
		//
		Scanner myObj = new Scanner (System.in);
		String country,state;
		System.out.println("Enter country and state");
		country=myObj.nextLine();
		state=myObj.nextLine();
		
		double shippingCharge = 5.00;
		if (country.equals("USA"))
		 if (state.equals("HI"))
		 shippingCharge = 10.00;
		else
		 shippingCharge = 20.00;
		System.out.println(shippingCharge);
		
		//string+¥ô¦ó«¬ºA=string
		//ch3
		int num1=7;
		int num2=10;
		if (num1>num2) {
			System.out.println("num1 is greater than num2");
		}else {
			System.out.println("num1 is smaller than num2");
		}
		//
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
	}
}
