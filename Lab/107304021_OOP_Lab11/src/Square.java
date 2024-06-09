
public class Square implements Shape {
	private double side;
	private double area;
	private double perimeter;
	
	public Square(double side) {
		this.side=side;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void calcArea() {
		area=side*side;
	}
	public void calcPerimeter() {
		perimeter=4*side;
	}

}
