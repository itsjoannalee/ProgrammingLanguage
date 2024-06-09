import java.util.ArrayList;
import java.util.Collections;//°O±oimport
public class Company {
		private ArrayList<String> rankingNames;
		private ArrayList<Double> rankingValues;
		private Analyzer analyzer;
		private double netValue;
		
		public Company(Analyzer analyzer) {
			this.analyzer=analyzer;
			rankingNames=new ArrayList<String>();
			rankingValues=new ArrayList<Double>();		
		}
		public void add(Object object) {
			rankingNames.add(analyzer.getName(object));
			rankingValues.add(analyzer.measurer(object));
		}
		public void calcNetValue() {
			netValue=0;
			for (double i:rankingValues) {
				netValue+=i;
			}
			
		}
		public String getInfo() {
			String info="";
			calcNetValue();
			info+=String.format("Net value: %.2f%n%n",netValue);
			info+=String.format("Name         Value%n");
			info+=String.format("----------------------%n");
			
			Collections.sort(rankingValues,Collections.reverseOrder());//­°§Ç±Æ¦C
			for(int i=0;i<rankingNames.size();i++) {
				info+=String.format("%-10s%9.2f%n",rankingNames.get(i),rankingValues.get(i));
			}
			return info;
		}
}
