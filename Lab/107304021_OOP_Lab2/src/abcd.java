
public class abcd {
	public static void main(String[] args) {
		for (int x=1;x<=10;x++) {
			for(int y=1;y<=4;y++) {
				System.out.printf("%10.0f",Math.pow(x,y));
			}
			System.out.println();						
		}
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		//
		int amount;
		amount=2;
		int total = amount * 10;
		System.out.println(total);
		//
		double dou=1.15;
		int integer=(int) dou;
		System.out.println(integer);
		//
		System.out.println(Math.round(-2.65));
		//
		int s1 = 2;
		int s2 = 3;
		int s3 = 5;
		int a=123;
		double average = (double) (s1 + s2 + s3) / 3;
		System.out.println(average);
		System.out.printf("%6d",a);
		//
		System.out.println();
		int day=5;
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		default:
			System.out.println("bitch");
		}
		//
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		//
		for (int i = 0; i < 5;i++) {
			System.out.println("yes");
			}
		//
		String str="AaBbCcDdeE";
		int upperCaseLetters = 0;
		for (int i = 0; i < str.length(); i++)
		{
		 char ch = str.charAt(i);
		 if (Character.isUpperCase(ch))
		 {
		 upperCaseLetters++;
		 }
		}
		System.out.println(upperCaseLetters);
		//
		boolean found = false;
		char ch;
		int position = 0;
		while (!found &&
		 position < str.length())
		{
		 ch = str.charAt(position);
		 if (Character.isLowerCase(ch))
		 {
		 found = true;
		 }
		 else { position++; }
		}
		System.out.println(position);
	}
	//
	

	
}
