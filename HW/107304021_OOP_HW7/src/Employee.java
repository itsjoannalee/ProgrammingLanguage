
public class Employee {
	private String name;
	private String title;
	private double dailyWage;
	private double workDay;
	private int overtimeCount;
	private double overtime;
	
	public Employee (String name, String title, double dailyWage) {
		this.name=name;
		this.title=title;
		this.dailyWage=dailyWage;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public double getWorkDay() {
		return workDay;
	}
	public int getOvertimeCount() {
		return overtimeCount;
	}
	public double getOvertime() {
		return overtime;
	}
	public double payment() {
		double wage=dailyWage*workDay+overtime*150;
		return wage;
	}
	public void addWorkDays(double day) {
		workDay+=day;
	}
	public void overtimeWork(double hour) {
		overtime+=hour;
		overtimeCount++;
	}
}
