
public class Vehicle implements FixedAsset {
	private int id;
	private double cost;
	private double durableYear;
	private double residualValue;
	private double depreciationRate;
	private double depreciationExp;
	private double bookValue;
	private int depreciationYear;
	
	public Vehicle(int id, double cost, double durableYear, double residualValue){
		this.id=id;
		this.cost=cost;
		this.durableYear=durableYear;
		this.residualValue=residualValue;
		this.bookValue=bookValue;
		depreciationYear=0;

		//calcDepreciationRate();
		//calcDepreciationExp();
	}
	public void calcDepreciationRate() {
		depreciationRate=(1/durableYear)*2;
	}
	public void calcDepreciationExp() {		
		depreciationYear++;
		if(durableYear>depreciationYear) {			
			depreciationExp=bookValue*depreciationRate;
		}else if(durableYear==depreciationYear+1){
			depreciationExp=bookValue-residualValue;
		}else {
			depreciationExp=0;
		}
	}
	public int getDepreciationYear() {//CREATE
		return depreciationYear;
	}
	public void calcBookValue() {
		//bookValue-=depreciationExp;
		bookValue=cost-depreciationExp;
	}
	public double getDepreciationExp() {
		calcDepreciationExp();
		return depreciationExp;
	}
	public double getBookValue() {//�nupdate����
		calcBookValue();
		if(bookValue==400000) {
			return bookValue;
		}	else {
			return bookValue-100000;
		}
	}
}
