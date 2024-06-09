
public class Course {
	private int courseID;
	private String courseName;
	private int credits,capacity,enrolled;
	
	public Course(int id, String name, int credits, int capacity) {
		this.courseID=id;
		this.courseName=name;
		this.credits=credits;
		this.capacity=capacity;
		enrolled=0;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	//¥[´îstudents
	public void setEnrolled(int enrolled) {
		this.enrolled+=enrolled;
	}
	public int getCourseID() {
		return this.courseID;
	}
	public String getCourseName() {
		return this.courseName;
	}
	public int getCredits() {
		return this.credits;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public int getEnrolled() {
		return this.enrolled;
	}
	public String getInfo() {
		String info="";
		info=String.format("%d %s %d %d/%d",getCourseID(),getCourseName(),getCredits(),getEnrolled(),getCapacity());
		return info;
	}


}
