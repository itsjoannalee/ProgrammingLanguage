
public class Grading {
	private int passMark=60;
	
	public Grading(int passMark) {
		this.passMark=passMark;
	}
	public void setPassMark(int passMark) {
		this.passMark=passMark;
	}
	public int getPassMark( ) {
		return this.passMark;
	}
	public String toLetterGrade(int score) {
		if(80<=score && score<=100) {
			return "A";
		}else if (70<=score && score<=79) {
			return "B";
		}else if (60<=score && score<=69) {
			return "C";
		}else if (50<=score && score<=59) {
			return "D";
		}else if (1<=score && score<=49) {
			return "E";
		}else if (score==0) {
			return "X";
		}else {
			return null;
		}
	}
	public double calculateAvg(int[] grades) {
		double sum=0;
		for (double indiv:grades) {
			sum+=indiv;
		}
		double avg = sum / grades.length;
		return avg;
	}
	public String summarizeGrade(int[] grades) {
		String infos="";
		infos=String.format("Avg. Score:%.0f%n",calculateAvg(grades));
		int passcount=0;
		int failcount=0;
		for (double indiv:grades) {
			if (indiv>=this.passMark) {
				passcount++;
			}else {
				failcount++;
			}
		}
		infos=infos+String.format("Pass:%d,failed:%d",passcount,failcount);
		return infos;
	}
	
	
	
}
