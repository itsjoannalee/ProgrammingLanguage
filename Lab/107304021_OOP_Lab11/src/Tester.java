
public class Tester {
	public static void main(String[] args) {
		Land florida=new Land(1,30000);
		florida.addArea(new Square(10));
		florida.addArea(new Circle(5));
		florida.addArea(new Triangle(3,4,5));
		florida.calcTotalValue();
		
		
		Land indiana=new Land(2,17000);
		indiana.addArea(new Square(5));
		indiana.addArea(new Circle(7));
		indiana.addArea(new Triangle(6,6,6));
		indiana.calcTotalValue();
		
		System.out.printf("<<Florida>>%n"+florida.getInfo()+"%n");
		System.out.printf("<<Indiana>>%n"+indiana.getInfo());
	} 

}
