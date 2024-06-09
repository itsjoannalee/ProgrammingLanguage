import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private ArrayList<Course> enrolledCourses;
	private int currentCredits,maxCredits;
	
	public Student(int studentID, String name) {
		this.studentID=studentID;
		this.studentName=name;
		currentCredits=0;
		maxCredits=25;
		enrolledCourses=new ArrayList<Course>();
	}
	public Student(int studentID, String name, int maxCredits) {
		this.studentID=studentID;
		this.studentName=name;
		this.maxCredits=maxCredits;
		currentCredits=0;
		enrolledCourses=new ArrayList<Course>();
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setCurrentCredits(int currentCredits) {
		this.currentCredits=currentCredits;
	}
	public void setMaxCredits(int maxCredits) {
		this.maxCredits=maxCredits;
	}
	public int getStudentID() {
		return this.studentID;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public  ArrayList<Course> getEnrolledCourses(){
		return this.enrolledCourses;
	}
	public int getCurrentCredits() {
		return this.currentCredits;
	}
	public int getMaxCredits() {
		return this.maxCredits;
	}
	//Find the Course object in enrolledCourses by the courseID 
	public Course getCourse(int id) {
		for(Course course:enrolledCourses) {
			if (course.getCourseID()==id) {
				return course;
			}
		}
		return null;
	}
	public void enroll(Course course) {
		if (course.getEnrolled()<=course.getCapacity()) {
			currentCredits+=course.getCredits();
			if(currentCredits<=maxCredits) {
				enrolledCourses.add(course);
				course.setEnrolled(1);
				getCurrentCredits();
			}else {
				System.out.println("studentID cannot enroll any course");
			}
		}else {
			System.out.println("courseID is full");
		}
	}	
	public void drop(int courseID) {
		for(Course course:enrolledCourses) {
			if (course.getCourseID()==courseID) {
				enrolledCourses.remove(course);
				course.setEnrolled(-1);
				this.currentCredits-=course.getCredits();
			}
		}
	}
	public void drop(Course course) {
		if(enrolledCourses.contains(course)==true){
			enrolledCourses.remove(course);
			course.setEnrolled(-1);
			this.currentCredits-=course.getCredits();
		}
	}
	public String getInfo() {
		String info="";
		info=String.format("Student ID: %d%n", studentID);
		info=info+String.format("Name: %s%n",studentName);
		info=info+String.format("Credits: %d/%d%n",getCurrentCredits(),getMaxCredits());
		
		for(Course f:enrolledCourses) {
				info=info+String.format("Course list:%n%d %s %d%n", f.getCourseID(), f.getCourseName(), f.getCredits());
		}
		return info;
	}
}
