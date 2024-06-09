
public class Land {
	private int id;
	private double valuePerAcre;
	private double totalArea;
	private double netValue;
	
	public Land(int id, double unitLandValue){
		this.id=id;
		this.valuePerAcre=unitLandValue;
	}
	
	public void addArea(Shape shape) {
		shape.calcArea();//要先算area 才get得到值!!!
		totalArea+=shape.getArea();
	}
	public void calcTotalValue() {
		netValue=totalArea*valuePerAcre;
	}
	public String getInfo() {
		String info="";
		info=String.format("The area ID:%d%n",id);
		info+=String.format("Value per acre: $%.2f%n",valuePerAcre);
		info+=String.format("Total area: %.2f%n",totalArea);
		info+=String.format("Total value: $%.2f%n",netValue);
		return info;
	}
	
	

}
