import java.util.ArrayList;
public class Supervisor extends Employee {
	private ArrayList <Employee> subordinates;
	
	public Supervisor(int ID, String name, BankAccount account, String department, int baseSalary, ArrayList <Employee> subordinates, int sales) {
		super(ID,name,account,department,baseSalary,sales);
		this.subordinates=new ArrayList <Employee>();
		this.subordinates = subordinates;//«Å§i
		int total=sales;//ª`·N!!
		for (Employee each:this.subordinates) {
			total+=each.getSales();
		}
		this.setSales(total);
	}
}
