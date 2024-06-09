
public class Food {
	private String name;
	private int id;
	private double price;
	private double pro;
	private double car;
	private double fat;
	
	public Food (int id,String name,double price,double pro,double car,double fat) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.pro=pro;
		this.car=car;
		this.fat=fat;
	}
	public double calories() {
		return 4*pro+4*car+9*fat;
	}
	public double getPrice() {//create
		return price;
	}
	public String getName() {//create
		return name; 
	}


}
