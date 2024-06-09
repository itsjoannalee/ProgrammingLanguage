import java.util.ArrayList;

public class WageAnalyzer implements Analyzer {
	private ArrayList<Employee> employees;
	
	public WageAnalyzer () {
		employees=new ArrayList<Employee>();
	}
	public void addEmployee(ArrayList<Employee> employees) {
		this.employees=employees;//把整個ArrayList匯入
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return employees.size();
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		double totalwage=0;
		for (Employee i:employees) {
			totalwage+=i.payment();
		}
		return totalwage;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		double avg=0;
		avg=sum()/count();
		return avg;
	}

	@Override
	public double max() {
		// TODO Auto-generated method stub
		double max=employees.get(0).payment();
		for (Employee i:employees) {
			if(i.payment()>max) {
				max=i.payment();
			}
		}
		return max;
	}

	@Override
	public double min() {
		// TODO Auto-generated method stub
		double min=employees.get(0).payment();
		for (Employee i:employees) {
			if(i.payment()<min) {
				min=i.payment();
			}
		}
		return min;
	}

	@Override
	public String summary() {
		// TODO Auto-generated method stub
		String info="";
		info+=String.format("%21s%9d%n", "Total employees:",count());
		info+=String.format("%21s%9.2f%n","Total wage:",sum());
		info+=String.format("%21s%9.2f%n","Average wage:",avg());
		info+=String.format("%21s%9.2f%n","Max wage:",max());
		info+=String.format("%21s%9.2f%n","Min wage:",min());
		return info;
	}
}
