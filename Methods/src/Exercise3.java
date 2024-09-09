import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		double userInput = scnObj.nextDouble();
		
		System.out.println(testValue(userInput));
	}
	
	public static String testValue(double value) {
		String printedString = "";
		
		if (value == 0) {
			printedString = "0";
		}
		else if (value > 0) {
			printedString = "Positive";
		}
		else {
			printedString = "Negative";
		}
		
		if (Math.abs(value) < 1) {
			printedString += " (Small)";
		}
		
		if (Math.abs(value) > 1000000) {
			printedString += " (Large)";
		}
		
		return printedString;
	}

}
