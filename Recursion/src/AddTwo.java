import java.util.Scanner;

public class AddTwo {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Please enter the term number you would like to find the value of:");
		int term = scnObj.nextInt();
		
		System.out.println(findNthTerm(term));
	}
	
	public static int findNthTerm(int n) {
		if (n == 0) {
			return 0;
		}
		else {
			int prevVale = findNthTerm(n - 1);
			return prevVale + 2;
		}
		
	}

}
