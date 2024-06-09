import java.util.ArrayList;

public class DMan {
	private String name;
	private int dCount;
	private int carryLimit;
	private ArrayList<Customer> custs;
	
	public DMan(String name, int carryLimit) {
		this.name=name;
		this.carryLimit=carryLimit;
		dCount=0;
		custs=new ArrayList<Customer>();
	}
	public double salary() {
		return custs.size()*10;
	}
	public void addCusts(Customer cust) {
		/*int foodamount=0;
		for(Customer c:custs ) {
			foodamount+=c.
		}*/
		if(cust.orderAmount()>carryLimit) {//是否要加前面顧客總食物量
			System.out.println("Too many to carry!");
		}else {
			custs.add(cust);
		}
	}




}
