import java.util.Arrays;//Arrays的排列用Arrays
public class Fruit {
	private String name;
	private int price,totalSales;
	private int[] sale;
	public Fruit (String name,int price) {
		this.name=name;
		this.price=price;
		totalSales=0;
		sale=new int[2];//3會跑出0
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getTotalSales () {
		return totalSales;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void updateTotalSales(int amount) {
		for (int i=0;i<3;i++) {
			if(sale[i]==0) {
				sale[i]=amount;
				break;
			}
		}
		totalSales+=amount;
	}
	public String getInfo() {
		String info="";
		info=String.format("%-6s%4s%-3s%-6s%n","Fruit","name",":",getName());
		info=info+String.format("%-6s%5s%-2s%-6d%n","Fruit","price",":",getPrice());
		Arrays.sort(sale);//由小到大排列
		String individual="";
		for(int ind:sale) {
			individual=individual+ind+", ";
		}
		
		info=info+String.format("%-6s%5s%-2s%6s%n","Indiv","sales",":",individual);
		info=info+String.format("%-6s%5s%-2s%-6d%n","Total","sales",":",getTotalSales());
		return info;
	}
}
	