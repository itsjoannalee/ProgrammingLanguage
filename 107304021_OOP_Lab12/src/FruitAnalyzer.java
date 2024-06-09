import lab.practice.Fruit;

public class FruitAnalyzer implements Analyzer {
	public double measurer(Object object) {
		Fruit f=(Fruit) object;
		double totalsale=0;
		for(double i :f.getSales()) {
			totalsale+=i;
		}
		double fruitvalue=totalsale*f.getPrice();
		return fruitvalue;
	}
	public String getName(Object object) {
		Fruit s=(Fruit) object;
		return s.getName();
	}
}
