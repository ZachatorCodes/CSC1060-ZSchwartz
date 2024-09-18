import java.util.Scanner;

public class HashBoxWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Enter height:");
		int height = scnObj.nextInt();

		System.out.println("Enter width:");
		int width = scnObj.nextInt();

		int i = height;
		int j = width;

		while (i > 0) {
			while (j > 0) {
				System.out.print('#');
				j--;
			}
			i--;
			j = width;
			System.out.println();
		}
	}
}
