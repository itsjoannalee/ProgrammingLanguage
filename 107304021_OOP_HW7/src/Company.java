import java.util.ArrayList;
public class Company {
	private String name;
	private ArrayList<Employee> employees;
	
	public Company(String name) {
		this.name=name;
		employees=new ArrayList<Employee>();
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public Employee findEmployee(String name) {
		for(int i=0; i<employees.size();i++) {
			if(employees.get(i).getName().equals(name)==true) {
				return employees.get(i);
			}
		}
			return null;
	}
	public void addWorkDays(String name, double day) {
		//String result="The employee is not found.";
		for(int i=0; i<employees.size();i++) {
			if(employees.get(i).getName().equals(name)==true) {
				employees.get(i).addWorkDays(day);
			}
		}
		/*for(int i=0; i<employees.size();i++) {
			if(employees.get(i).getName().contains(name)==false) {
				System.out.println(result);
			}
		}*/
	}
	public void overtimeWork(String name, double hour) {
		for(int i=0; i<employees.size();i++) {
			if(employees.get(i).getName().equals(name)==true) {
				employees.get(i).overtimeWork(hour);
			}
		}//System.out.println("The employee is not found.");//不確定
	}
	public String callAnalyzer(Analyzer analyzer) {
		analyzer.addEmployee(employees);//不確定
		return analyzer.summary();
	}
	public String summary() {
		String info="";
		info+=String.format("%10s%10s%n","Company:",name);
		info+=String.format("%10s%10s%15s%21s%10s%12s%n","Name","Work Day","Overtime Count","Overtime Hour(Total)","Wage","Title");
		
		for(int i=0;i<employees.size();i++) {
			info+=String.format("%10s%10.2f%15d%21.2f%10.2f%12s%n",employees.get(i).getName(),employees.get(i).getWorkDay(),
				employees.get(i).getOvertimeCount(),employees.get(i).getOvertime(),employees.get(i).payment(),employees.get(i).getTitle());
		}
		return info;
	}
}
