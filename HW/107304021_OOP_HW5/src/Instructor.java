import java.util.ArrayList;
public class Instructor extends Person{
	private String department;
	private ArrayList<String> lectureList;
	private ArrayList<Student> studentList;
	
	public Instructor(int ID, String name, String department) {
		super(ID,name);
		this.department=department;
		lectureList=new ArrayList<String>();
		studentList=new ArrayList<Student>();		
	}
	public String getDepartment() {
		return department;
	}
	public ArrayList<String> getLectureList(){
		return lectureList;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	public void addLecture(String lectureName) {
		lectureList.add(lectureName);
	}
	public boolean addStudent(Student student) {
		if(student.getTutorName().equals(getName())) {
			studentList.add(student);
			return true;
		}else {
			return false;
		}
	}
	public String getStudentName() {
		String each="";
		for(Student s:studentList) {
			each=each+s.getName()+",";
		}
		return each;
      /*String str="";
		for(int i=0;i<studentList.size();i++) {
			str+= studentList.get(i).getName()+",";
		}
		return str;*/
	}
	public double getStudentAverage() {
		double sum=0;
		for(Student i :studentList){
			sum+=i.getGrade();
			}
		double avg=sum/studentList.size();
		return avg;
	}
	public String getInfo() {
		String info="";
		String eachlec="";
		for(String lec:lectureList) {
			eachlec=eachlec+lec+",";
		}
		info=String.format("Instructor[ID=%d,name=%s,department=%s,lectureList=%s,studentList=%s]"
				,getID(),getName(),department,eachlec,getStudentName());
		return info;
	}
}
