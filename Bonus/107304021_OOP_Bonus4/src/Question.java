
public class Question {
	private String text,answer;
	
	public Question() {
		text="";
        answer="";	
	}
	public void setText(String queastionText) {
		this.text=queastionText;
	}
	public void setAnswer(String correctResponse) {
		this.answer=correctResponse;
	}
	public boolean checkAnswer(String response) {
		return response.equals(this.answer);
	}
	public  void display() {
		System.out.println(text);
	}


}
