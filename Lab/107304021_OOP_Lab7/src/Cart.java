
public class Cart {
	private Fruit[] basket;
	private int[] subAmount;
	private int totalExpense;
	public Cart () {
		 basket=new Fruit[3];
		 subAmount= new int[3];
		 totalExpense=0;
	}
	public int getTotalExpense() {
		return totalExpense;
	}
	public void addItem(Fruit fruit, int amount) {
		for (int i=0;i<3;i++) {
			if(basket[i]==null) {//是null不是0
				basket[i]=fruit;
				break;
			}
		}
		for (int j=0;j<3;j++) {
			if(subAmount[j]==0) {
				subAmount[j]=amount;
				break;
			}
		}
		fruit.updateTotalSales(amount);
		}

	
	public void searchItem(Fruit fruit) {
		String result = "Your basket does not have this product.";
		for (Fruit frt : basket) {
			if (frt == fruit) {
				result = "Your basket have this product.";//更新result
			}
		}
		System.out.println(result);
	}
	public void totalExpense() {
		if(basket[0]!=null) {
			int j=0;//設在迴圈外
			for(Fruit ft:basket) {
				if(basket[j]!=null) {
					totalExpense += ft.getPrice()*subAmount[j];
				j++;					
				}	
			}
		}else {
			System.out.println("Your basket does not have this product.");
		}
	}
	
	public String getInfo() {
		String info="";
		totalExpense();//要先用totalExpense()算出totalExpense，之後再get
		info=String.format("The current expense is:NT$%d%n",getTotalExpense());
		info=info+String.format("%-7s%-12s%4s%n","Name","Price($NT)","Unit");
		int i=0;//設在迴圈外
		for(Fruit frt:basket) {
			//先確定有東西
			if(basket[i]!=null) {
			info=info+String.format("%-6s%-4s%-7d%-3s%3d%n",frt.getName(),":",frt.getPrice(),"*",subAmount[i]);
			i++;
			}
		}
		return info;
	}
}