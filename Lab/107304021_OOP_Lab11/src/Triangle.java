
public class Triangle implements Shape {
	private double sideA;
	private double sideB;
	private double sideC;
	private double area;
	private double perimeter;
	
	public Triangle(double sideA, double sideB, double sideC){
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void calcArea() {
		perimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter- sideB) * (perimeter - sideC));
		
	}
	public void calcPerimeter() {
		perimeter=sideA+sideB+sideC;
	}
	

}
