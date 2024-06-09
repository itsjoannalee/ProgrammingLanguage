public class IntegerNameConverter {
	private int num;
	public IntegerNameConverter(int num) {
	this.num=num;
	}
	
	public String intName() {
		String name="";
		int part =num;
		if (part>=100) {
			name=digitName(part/100)+" hundred ";
			part=part%100;
		}if (part>=20) {
			name=name+tensName(part/10)+" ";
			part=part%10;
		}if (10<=part&& part<=19) {
			name=name+teenName(part);
		}if (1<=part&& part<=9) {
			name=name+digitName(part);
		}
		return name;
		
	}
	public String digitName(int num) {
		if (num==1) {
			return "one";
		}else if (num==2){
			return "two";
		}else if (num==3){
			return "three";
		}else if (num==4){
			return "four";
		}else if (num==5){
			return "five";
		}else if (num==6){
			return "six";
		}else if (num==7){
			return "seven";
		}else if (num==8){
			return "eight";
		}else if (num==9){
			return "nine";
		}else return null;
	}	
	public String tensName(int num) {
		if (num==2) { 
			return "tewnty";
		}else if (num==3){
			return "thirty";
		}else if (num==4){
			return "fourty";
		}else if (num==5){
			return "fifty";
		}else if (num==6){
			return "sixty";
		}else if (num==7){
			return "seventy";
		}else if (num==8){
			return "eighty";
		}else if (num==9){
			return "ninety";
		}
		return null;
	} 
	public String teenName(int num) {
		if (num==10) {
			return "ten";
		}else if (num==11){
			return "eleven";
		}else if (num==12){
			return "twelve";
		}else if (num==13){
			return "thirteen";
		}else if (num==14){
			return "fourteen";
		}else if (num==15){
			return "fifteen";
		}else if (num==16){
			return "sixteen";
		}else if (num==17){
			return "seventeen";
		}else if (num==18){
			return "eighteen";
		}else if (num==19){
			return "nineteen";
		}
		return null;
	}

}
