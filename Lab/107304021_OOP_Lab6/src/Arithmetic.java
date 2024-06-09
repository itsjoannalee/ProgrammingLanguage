
public class Arithmetic {
	private int num1,num2,num3,sum,min,max1,max2;
	public Arithmetic (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		this.num3=0;
		this.sum=num1+num2+num3;//declare sum
		min();
		topTwoValue();
	}
	public Arithmetic (int num1, int num2, int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.sum=num1+num2+num3;//declare sum
		min();
		topTwoValue();
	}
	
	public void min() {
		 min=Math.min(Math.min(num1, num2),num3);
	}
	public double topTwoAvg() {
		double avg=(sum-min)/2.0;
		return avg;
	}
	public void topTwoValue() {
		if (num1==min) {
				 max1=num2;
				 max2=num3;	
		}else if(num2==min) {
				max1=num1;
				max2=num3;
		}else {
				max1=num1;
				max2=num2;
		}
	}
	//自己寫getmethod
	public int getMax1(){
		return this.max1;
	}
	public int getMax2(){
		return this.max2;
	}
	//先求最大公因數hcf再求lmc
	public int topTwoLMC() {
		int hcf=1;
		for(int i=1;i<=max1;i++) {
			if(max1%i==0 && max2%i==0) {
				hcf=i;
			}
		}
		int lmc=(max1*max2)/hcf;
		return lmc;
		
	}
}
