
public class Student extends Person{
	private String major,tutorName;
	private int enrolledYear;
	private double grade;
	
	public Student (int ID, String name, String major, int enrolledYear, String tutorName, double grade) {
		super(ID,name);
		this.major=major;
		this.enrolledYear=enrolledYear;
		this.tutorName=tutorName;
		this.grade=grade;
		//initialize gradeList
	}
	public String getMajor() {
		return major;
	}
	public int getEnrolledYear() {
		return enrolledYear;
	}
	public double getGrade() {
		return grade;
	}
	public String getTutorName() {
		return tutorName;
	}
	public String getInfo() {
		String info="";
		info=String.format("Student[ID=%d, name=%s, major=%s, enrolledYear=%d, grade=%.2f]",getID(),getName(),major,enrolledYear,grade);
		return info;
	}

}
