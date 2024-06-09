import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Tester test = new Tester();
		Question Q1 = new Question();
		Q1.setText("Who was the inventor of Java?");
		Q1.setAnswer("James Gosling");
		ChoiceQuestion Q2 = new ChoiceQuestion();
		Q2.setText("What was the original name of the Java language?");
		Q2.addChoices("*7", false);
		Q2.addChoices("Duke", false);
		Q2.addChoices("Oak", true);
		Q2.addChoices("Gosling", false);
		Q1.display();
		System.out.print("Your answer:");
		System.out.println(Q1.checkAnswer(input.nextLine()));
		System.out.println();
		Q2.display();
		System.out.print("Your answer:");
		System.out.println(Q2.checkAnswer(input.next()));
	}
}
