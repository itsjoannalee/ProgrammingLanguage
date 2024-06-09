
public class Lab3 {
	
	public static void main(String[] args) {
		//1
		int num1=2;
		System.out.println(num1);
	    //
		short num2=6;
		System.out.println(num2);
		//
		float num3=10.25f;
		System.out.println(num3);
		//
		double num4=12.145d;
		System.out.println(num4);
		//2
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		double div= num1/(double)num2;
		System.out.println(div);
		//3 小數轉換成整數時，要先將等號右邊的小數型態轉換成整數型態，再指派給新的整數變數，則小數點後面的數字會直接被移除，轉成整數。
		int integer=(int) num3;
		System.out.println(integer);
		//4  整數轉換成小數時，若等號右邊運算後的值會出現小數，則需先將右邊轉換為小數型態，再指派給新的小數變數，即可轉成小數。但此題因等號右邊無需運算，故直接轉換即可。
		double decimal=num1;
		System.out.println(decimal);
		//5
		int days_of_month=30;
		//6
		byte sum =(byte) days_of_month;
		System.out.println(sum);					
	}
}

