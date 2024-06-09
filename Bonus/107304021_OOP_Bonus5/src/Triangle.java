
public class Triangle extends Shape{
	private double sideA,sideB,sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
		setType("Triangle");
		calculateArea();
		calculatePerimeter();
	}
	public void calculateArea() {
		double s=(sideA+sideB+sideC)/2;
		setArea(Math.sqrt(s* (s - sideA) * (s - sideB) * (s - sideC)));
	}
	public void calculatePerimeter() {
		setPerimeter(sideA+sideB+sideC);
	}

}
