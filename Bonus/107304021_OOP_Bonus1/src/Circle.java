 import java.util.Scanner;
public class Circle {
	private double radius, x, y, area, circumference;
	public static void main(String[] args) {
		Circle circle1=new Circle();
		Circle circle2=new Circle();
		circle2.radius=5;
		circle2.x=0;
		circle2.y=0;
		Scanner  inputScanner=new Scanner(System.in);
		System.out.print("Please input the radius of the circle1:");
		double radius=inputScanner.nextDouble();
		System.out.print("Please enter xy-coordinate of center for the circle1 (separated by spaces):");
		double x=inputScanner.nextDouble();
		double y=inputScanner.nextDouble();
		System.out.print("please enter the xy-coordinate of the point:");
		double x1=inputScanner.nextDouble();
		double y1=inputScanner.nextDouble();
		
		double area=circle1.area(radius);
		System.out.printf("The area of the circle1 is %.2f\n",area);
		double circumference=circle1.circumference(radius);
		System.out.printf("The circumference of the circle1 is %.2f\n",circumference);
		//直接call method
		circle1.rangePoint(x, y, radius, x1, y1);
		circle1.rangeCircle(radius, x, y, circle2.radius, circle2.x, circle2.y);	
	}
	
	public double area(double radius) {
		double area=Math.PI * (radius * radius);
		return area;
	}
	public double circumference(double radius) {
		double circumference=Math.PI * 2*radius;
		return circumference;
	}
	//沒有return
	public void rangePoint(double x,double y,double radius,double x1,double y1) {
		double d=Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));
		String output1;
		if(d<radius) {
			output1="the point inside the circle.";
		}else if(d==radius) {
			output1="the point on the circle.";
		}else {
			output1="the point outside the circle.";
		}
		System.out.printf("The relationship between point and circle:%s\n",output1);
	}
	//沒有return
	public void rangeCircle(double radius,double x,double y,double radius_c2,double x2,double y2) {
		double d=Math.sqrt(Math.pow(x-x2,2)+(Math.pow(y-y2,2)));
		String output2;
		if(d < Math.abs(radius-radius_c2)) {
			output2="the centre of one circle will lie on the other circle.";
		}else if(d == Math.abs(radius-radius_c2)) {
			output2="two circles are concentric.";
		}else if(Math.abs(radius-radius_c2)<d && d< radius+radius_c2) {
			output2="two circles will intersect at two points.";
		}else if(d == radius+radius_c2) {
			output2="the circles touch externally";
		}else {
			output2="the circles do not touch or intersect each other.";
		}
		System.out.printf("The relationship between the two circles:%s\n",output2);
	}
	

}