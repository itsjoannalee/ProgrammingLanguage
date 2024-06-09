import java.util.ArrayList;

public class Customer {
	private String name;
	private double money;
	private ArrayList<Food> foods;
	private Payment payment;
	private double calLeft;
	private double subtotal;
	
	public Customer (String name, double money, double calLeft, Payment payment) {
		this.name=name;
		this.money=money;
		this.calLeft=calLeft;
		this.payment=payment;
		subtotal=0;
		foods=new ArrayList<Food>();
	}
	public int orderAmount() {//create
		return foods.size();
	}
	public void order(Food food) {
		double costs=0;
		for(Food f : foods) {
			costs+=f.getPrice();
		}
		if(money<costs+food.getPrice()) {//不確定要不要加總前面食物金額
			System.out.printf("%s don't have enough money!%n",name);
		}else {
			if(food.calories()>calLeft) {
				System.out.printf("Too fat for %s%n",name);
			}else {
				foods.add(food);
				calLeft-=food.calories();
			}
		}
	}
	public String orderList() {
		String info="";
		for(int i=0; i<foods.size();i++) {
			info+=String.format("%-10s%10.2f%n",foods.get(i).getName(), foods.get(i).getPrice());
		}
		double foodcost=0;
		for(Food f :foods) {
			foodcost+=f.getPrice();
		}
		info+=String.format("%-10s%10.2f%n","Total",foodcost);
		return info;
	}
	public double pay() {
		double totalcosts=0;
		for(Food f : foods) {			
			totalcosts+=f.getPrice();
		}
		if(payment instanceof Cash) {//判斷付款方式
			Cash c= (Cash) payment;
			if(money<c.totalPrice(foods)) {
				System.out.printf("%s don't have enough money!",name);
				return 0;
			}else {
				return c.totalPrice(foods) ;//c.totalPrice(foods)=1525
			}
		}else {
			CreditCard card=(CreditCard) payment;
			if(money<card.totalPrice(foods)) {
				System.out.printf("%s don't have enough money!%n",name);
				return 0;
			}else {
				money-=totalcosts;
				return card.totalPrice(foods) ;//-promotion discount
			}
		}
	}
	public double getMoney() {//create
		return money;
	}

}
