
public class Machine implements FixedAsset {
	private int id;
	private double cost;
	private double durableYear;
	private double residualValue;
	private double depreciationExp;
	private double bookValue;
	private int depreciationYear;

	public Machine(int id, double cost, double durableYear, double residualValue) {
		this.id=id;
		this.cost=cost;
		this.durableYear=durableYear;
		this.residualValue=residualValue;
		depreciationYear=0;
		
	}
	

	@Override
	public void calcDepreciationExp() {
		// TODO Auto-generated method stub
		if(durableYear>depreciationYear) {
			depreciationExp=(cost-residualValue)/durableYear;
		}else {
			depreciationExp=0;
		}
	}

	@Override
	public void calcBookValue() {
		// TODO Auto-generated method stub
		bookValue=cost-depreciationExp;
	}

	@Override
	public double getDepreciationExp() {
		// TODO Auto-generated method stub
		calcDepreciationExp();
		return depreciationExp;
	}

	@Override
	public double getBookValue() {
		// TODO Auto-generated method stub
		calcBookValue();
		return bookValue;
	}

}
