package lab.practice;
import java.util.ArrayList;

public class Fruit implements Comparable<Fruit>{
	private String name;
	private double price;
	private ArrayList<Double> sales;
	
	@Override
	public int compareTo(Fruit fruit) {
		// TODO Auto-generated method stub
		if(price < fruit.price) {         
			return 0;
		}else if (price > fruit.price) {
			return 1;
		}else {
			return -1;
		}
	}
	public Fruit(String name, double price, ArrayList<Double> sales) {
		this.name=name;
		this.price=price;
		this.sales=sales;//要接收sales的值，不是new ArrayList<Double>()
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public ArrayList <Double> getSales(){
		return sales;
	}
	
}
