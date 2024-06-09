
public class Circle extends Shape {
	private double radius,pi;
	
	public Circle(double radius) {
		this.radius=radius;
		pi=3.14;
		setType("Circle");
		calculateArea();
		calculatePerimeter();
	}
	public void calculateArea() {
		setArea(radius*radius*pi);
	}
	public void calculatePerimeter() {
		setPerimeter(2*radius*pi);
	}

}
