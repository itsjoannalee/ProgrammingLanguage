import java.util.Scanner;
public class salary {
	public static void main(String[] args) {
		double sum=0;
		int count=0;
		double salary=0;
		System.out.println("enter salary,-1 to finish:");
		Scanner input = new Scanner(System.in);
		while (salary!=-1){
		salary=input.nextDouble();
		if(salary!=-1) {
		sum=sum+salary;
		count++;
		 }
		}
		if(count>0) {
			double average =sum/count;
			System.out.println("average salary:"+average);
		}else {
			System.out.println("no data");
		}
		
	}

}
