import java.util.ArrayList;

public class OvertimeAnalyzer implements Analyzer {
	private ArrayList<Employee> employees;
	
	public OvertimeAnalyzer () {
		this.employees=new ArrayList<Employee> ();
	}
	@Override
	public void addEmployee(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		this.employees=employees;//把整個ArrayList匯入
		for(int i=0;i<employees.size();i++) {
			if(employees.get(i).getOvertime()==0) {
				employees.remove(i);      //再剔除沒超時工作的人
			}
		}
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return employees.size();
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		double totalovertime=0;
		for (Employee i:employees) {
			totalovertime+=i.getOvertime();
		}
		return totalovertime;
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
		double max=employees.get(0).getOvertime();
		for (Employee i:employees) {
			if(i.getOvertime()>max) {
				max=i.getOvertime();
			}
		}
		return max;
	}

	@Override
	public double min() {
		// TODO Auto-generated method stub
		double min=employees.get(0).getOvertime();
		for (Employee i:employees) {
			if(i.getOvertime()<min && i.getOvertime()>0) {
				min=i.getOvertime();
			}
		}
		return min;
	}

	@Override
	public String summary() {
		// TODO Auto-generated method stub
		String info="";
		info+=String.format("%21s%9d%n", "Total employees:",count());
		info+=String.format("%21s%9.2f%n","Total hours:",sum());
		info+=String.format("%21s%9.2f%n","Average hours:",avg());
		info+=String.format("%21s%9.2f%n","Max hours:",max());
		info+=String.format("%21s%9.2f%n","Min hours:",min());
		return info;
	}

}
