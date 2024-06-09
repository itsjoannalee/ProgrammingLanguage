public class Student {
	private int studentID;
	private String name,department;
	private int[] grades;
	private int gradesIndex;
	
	
	public Student(int studentID, String name, String department) {
		this.studentID=studentID;
		this.name=name;
		this.department=department;
		grades=new int[5];
		gradesIndex=0;
	}
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public int getStudentID( ) {
		return this.studentID;
	}
	public String getName( ) {
		return this.name;
	}
	public String getDepartment( ) {
		return this.department;
	}
	public int[] getGrades( ) {
		return grades;
	}
	public int getGradesIndex( ) {
		return gradesIndex;
	}
	public int getGrade(int idx) {
		return grades[idx];
	}
	public void addGrade(int grade) {
		if (gradesIndex < 5) {
			for (int Index = 0; Index < 5; Index++) {
			if(grades[Index]==0) {
				grades[Index]=grade;
				break;
			}
			gradesIndex=Index;
		}
		    gradesIndex++;
		} 
		if (gradesIndex >= 5) {
			System.out.println("Array index out of bounds.");
		}
	}
	
	public void updateGrade(int idx, int grade){
		grades[idx]=grade;
	}
	public String info() {
		String info="";
		info=String.format("Student ID: %d%n",this.studentID);
		info=info+String.format("Name:%s%n",this.name);
		info=info+String.format("Department:%s%n",this.department);
		String individualGrades="";
		for (int indiv:grades) {
			individualGrades=individualGrades+indiv+" ";
		}
		info=info+String.format("Grades:%s%n",individualGrades);
		return info;
	}
}
