
public class Tester {
	public static void main(String[] args) {
		Square square=new Square(8);
		Circle circle=new Circle(6);
		Triangle triangle=new Triangle(3,4,5);
		Shape[] shapes= {square,circle,triangle};
		
		for(Shape i:shapes) {
			System.out.println(presentResult(i));
		}
		//System.out.println(presentResult(square));
		//System.out.println(presentResult(circle));
		//System.out.println(presentResult(triangle));
	}
		public static String presentResult(Shape s){
			String str="";
			str=String.format("%s %s%s%s",s.getType(),"[[",s.toString(),"]]");
			return str;
		}

	}

