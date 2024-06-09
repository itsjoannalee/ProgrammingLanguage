
public class Employee {
	private int ID;
	private double baseSalary,totalSalary;
	private int sales;
	private String name,department;
	private BankAccount account;
	
	public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
		this.ID=ID;
		this.name=name;
		this.account=account;
		this.department=department;
		this.baseSalary=baseSalary;
		this.sales=sales;
		this.totalSalary=0;
	}
	public void setSales(int sales) {
		this.sales=sales;
	}
	public String getDepartment() {
		return this.department;
	}
	public int getSales() {
		return this.sales;
	}
	public double getTotalSalary() {
		return this.totalSalary;
	}
	public void monthEnd() {
		double taxRate=0.03;
		double salesBonus=500;
		totalSalary=(baseSalary + (sales * salesBonus))*(1 -taxRate);
		//Transfer monthly salary to the employee¡¦s account
		account.deposit(totalSalary);
	}
	public String getInfo() {
		String info="";
		info=String.format("ID:%d%n", ID);
		info=info+String.format("Name:%s%n",name);
		info=info+String.format("Department:%s%n",department);
		info=info+String.format("Total sales:%d%n",sales);
		info=info+String.format("Total salary:%.0f%n",totalSalary);
		return info;
	}
	
	

}
