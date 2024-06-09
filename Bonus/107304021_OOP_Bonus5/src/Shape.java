
public class Shape {
	private double area,perimeter;
	private String type;
	
	public void setArea(double area) {
		this.area=area;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter=perimeter;
	}
	public void setType(String type) {
		this.type=type;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		String str="";
		str=String.format("Area:%.2f, Perimeter:%.2f", getArea(),getPerimeter());
		return str;
	}

}
