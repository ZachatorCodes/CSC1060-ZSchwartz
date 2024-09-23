import java.util.Scanner;

public class RightAngleLoop {

	public static void main(String[] args) {
		int rows = getUserNumber();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static int getUserNumber() {		
		Scanner scnObj = new Scanner(System.in);
		System.out.println("Input number of rows:");
		return scnObj.nextInt();
	}
}
