
public class Circle implements Shape {
	private final double PI;//��iconstructor?
	private double radius;
	private double area;
	private double perimeter;
	
	public Circle(double radius){
		this.radius=radius;
		PI=3.14;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void calcArea() {
		area=radius*radius*PI;
	}
	public void calcPerimeter() {
		perimeter=2*radius*PI;
	}

}
