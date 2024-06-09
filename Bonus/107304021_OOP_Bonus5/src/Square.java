
public class Square extends Shape{
	private double side;
	
	public Square(double side) {
		this.side=side;
		setType("Square");
		calculateArea();
		calculatePerimeter();
	}
	public void calculateArea() {
		setArea(side*side);
	}
	public void calculatePerimeter() {
		setPerimeter(4*side);
	}

}
