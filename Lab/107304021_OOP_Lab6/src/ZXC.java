
public class ZXC {
	public static void main(String[] args) {
	int[] items= {33,44,66,8,9,78};
	int index=0;
	for (int item : items) {
		if (index>0) {
			System.out.print(" | ");
		}
		System.out.print(item);
		index++;
	}
	//
	System.out.println();
	for (int i:items) {
		if(i==items[items.length-1]) {
			System.out.print(i);
		}else {
			System.out.print(i+"|");
		}
	}
	}
}
