import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Triangle triangle=new Triangle();
		Scanner sideScanner =new Scanner(System.in);
		Scanner angleScanner =new Scanner(System.in);
		System.out.print("Please enter the length of the two sides of the triangle:");
		double sideA=sideScanner.nextDouble();
		double sideB=sideScanner.nextDouble();
		System.out.print("Please enter the angle of the triangle:");
		double angleC=angleScanner.nextDouble();
		
		double sideC= triangle.side(sideA, sideB, angleC);
		System.out.printf("The other side length is %.0f\n",sideC);
		double perimeter=triangle.perimeter(sideA, sideB, sideC);
		System.out.printf("The perimeter of the triangle is %.0f\n",perimeter);
		double area=triangle.area(sideA, sideB, sideC, perimeter);//¥[¤Jperimeter
		System.out.printf("The area of the triangle is %.2f\n",area);
		double angleA=triangle.angle(sideA, sideB, sideC);
		System.out.printf("The opposite angle of sideA(length(s):%.2f) in the triangle is %.0f degrees\n",sideA,angleA);
		double angleB=triangle.angle(sideB, sideA, sideC);
		System.out.printf("The opposite angle of sideB(length(s):%.2f) in the triangle is %.0f degrees\n",sideB,angleB);
	}
	
	public double side(double sideA,double sideB, double angleC) {
		double sideC=Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA *sideB * Math.cos(Math.toRadians(angleC)));
		return sideC;
    }
	public double perimeter(double sideA,double sideB,double sideC) {
		double perimeter=sideA+sideB+sideC;
		return perimeter;
	}
	public double area(double sideA,double sideB,double sideC,double perimeter) {
		perimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
		return area;
	}
	public double  angle(double sideA,double sideB,double sideC) {
		double angle=Math.acos((Math.pow(sideA, 2) - Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (-2 * sideB * sideC));
		return Math.toDegrees(angle);
	}
	
}