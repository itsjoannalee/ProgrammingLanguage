import java.util.ArrayList;

public class Cash implements Payment {
	public double totalPrice(ArrayList<Food> foods) {
		double foodprice=0;
		for(Food i :foods) {
			foodprice+=i.getPrice();
		}	
		return foodprice+foods.size()*5;
	}
	public double promote(ArrayList<Food> foods) {
		for(Food f :foods) {
			if(f.getName().equals("lobster")) {
				return 50;
			}
		}
		return 0;
	}
}
