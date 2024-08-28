import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		tempCalc();
		
		double farenheitStart = 50;
		double celsiusEnd = (farenheitStart - 32) * (5.0 / 9);
		
		double celsiusStart = 50;
		double farenheitEnd = (celsiusStart * (9.0 / 5)) + 32;
		
	}
	
	public static void tempCalc() {
		
		// Create Scanner object
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Are you converting from...\n1. Farenheit to Celsius\nor...\n2. Celsius to Farenheit");
		int userChoice = scannerObj.nextInt();
		
		System.out.println("Please enter your starting temperature:");
		double startingTemp = scannerObj.nextDouble();
		
		if (userChoice == 1) {
			double celsiusEnd = (startingTemp - 32) * (5.0 / 9.0);
			System.out.println(String.format("The final temperature is %s degrees Celsius", celsiusEnd));
		}
		else {
			double farenheitEnd = (startingTemp * (9.0 / 5.0)) + 32;
			System.out.println(String.format("The final temperature is %s degrees Farenheit", farenheitEnd));
		}
		
		scannerObj.close();
		
	}

}
