import lab.practice.Stock;

public class StockAnalyzer implements Analyzer {
	public double measurer(Object object) {
		Stock s= (Stock) object;
		double stockvalue=(s.getClosingPrice()-s.getOpeningPrice())*s.getVolume()*1000;
		return stockvalue;
	}
	public String getName(Object object) {
		Stock s= (Stock) object;
		String symbolname=s.getSymbol();
		return symbolname;
	}
	


}
