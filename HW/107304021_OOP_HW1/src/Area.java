import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Please input the radius:");
		double pi = 3.14;
		String r="radius";
		double rInput=Scanner.nextDouble();
		double radius=rInput;
		double area=radius* radius* pi;
		System.out.printf("Area:%.2f",area);

	}

}
