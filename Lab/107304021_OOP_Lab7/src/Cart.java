
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
			if(basket[i]==null) {//�Onull���O0
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
				result = "Your basket have this product.";//��sresult
			}
		}
		System.out.println(result);
	}
	public void totalExpense() {
		if(basket[0]!=null) {
			int j=0;//�]�b�j��~
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
		totalExpense();//�n����totalExpense()��XtotalExpense�A����Aget
		info=String.format("The current expense is:NT$%d%n",getTotalExpense());
		info=info+String.format("%-7s%-12s%4s%n","Name","Price($NT)","Unit");
		int i=0;//�]�b�j��~
		for(Fruit frt:basket) {
			//���T�w���F��
			if(basket[i]!=null) {
			info=info+String.format("%-6s%-4s%-7d%-3s%3d%n",frt.getName(),":",frt.getPrice(),"*",subAmount[i]);
			i++;
			}
		}
		return info;
	}
}