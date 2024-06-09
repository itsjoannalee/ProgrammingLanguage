import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int layer = 1;
		Scanner layerScanner = new Scanner(System.in);
		System.out.print("Please input the layer:");
		layer = layerScanner.nextInt();
		for (int i = 1; i <= layer; i++) {
			for (int k = 1; k <= (layer-1) - (i - 1); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1 + 2 * (i - 1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
