
public class VIP extends Customer{
	private int level;
	
	public VIP(String name, double money, double calLeft, Payment payment,int level) {
		super(name, money, calLeft, payment);
		// TODO Auto-generated constructor stub
		this.level=level;
	}
	public double pay() {
		return super.pay()-level*10;
	}
	public double getMoney() {//create
		return super.getMoney()-pay(); //vip�n��쥻�����⦩���u�f�᪺���B
	}

}
