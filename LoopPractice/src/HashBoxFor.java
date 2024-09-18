import java.util.Scanner;

public class HashBoxFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Enter height:");
		int height = scnObj.nextInt();
		
		System.out.println("Enter width:");
		int width = scnObj.nextInt();
		
		for (int i = height; i > 0; i--) {
			for (int j = width; j > 0; j--) {
				System.out.print('#');
			}
			System.out.println();
		}
	}
}
