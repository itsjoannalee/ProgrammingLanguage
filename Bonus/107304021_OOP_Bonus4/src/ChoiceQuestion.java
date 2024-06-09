import java.util.ArrayList;
public class ChoiceQuestion extends Question{
	private ArrayList<String> choices;
	
	public ChoiceQuestion() {
		choices=new ArrayList<String>();
	}
	public void addChoices(String choice, boolean correct) {
		choices.add(choice);
		if(correct==true) {
			setAnswer(Integer.toString(choices.size()));
		}
	}
	public void display() {
		super.display();
		for(int i=0;i<choices.size();i++) {
			System.out.printf("%d:%s%n",i+1,choices.get(i));
		}
	}
	

}
